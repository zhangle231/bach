# -*- coding: utf-8 -*-
from flask import Flask
from flask import render_template

import time
from multiprocessing import Process,freeze_support
import urllib.request

app = Flask(__name__)

dsvEntitys = {}

def init(args):
    dsv_list = []
    for i in range(50):
        dsv = {}
        dsv['no'] = i
        dsv['name'] = '/data/dwetl/tmp/0.dsv'
        dsv['date'] = '2019-08-23 16:50:00'
        dsv['state'] = 'wait'
        dsv_list.append(dsv)
    args["dsv_list"] = dsv_list

init(dsvEntitys)

@app.route('/')
def hello_world():
    return 'Hello, World'

#清洗文件
@app.route('/clean')
def clean_file():
    print('clean_file')
    dsv_list = dsvEntitys["dsv_list"]
    for dsv in dsv_list:
        if dsv['state'] == 'wait':
           dsv['state'] = 'cleanning'
           time.sleep(5)
           dsv['state'] = 'clean'
           break
    return 'clean file'

#建外表
@app.route('/create')
def create():
    dsv_list = dsvEntitys['dsv_list']
    for dsv in dsv_list:
        if dsv['state'] == 'clean':
            dsv['state'] = 'create'
            break
    return 'create table'
#更新数据
@app.route('/update')
def update():
    return 'update'

#显示文件清洗情况
@app.route('/dsv')
def dsv():
    dsv_data = dsvEntitys
    return render_template('dsv.html', dsv_data=dsv_data)

@app.route('/hello/')
@app.route('/hello/<name>')
def hello(name=None):
    return render_template('hello.html', name=name)

def headBeat():
    while True:
        print('heart beat')
        with urllib.request.urlopen("http://127.0.0.1:5000/clean") as f:
            print(f.read().decode('utf-8'))
        time.sleep(10)

@app.route('/process')
def process():
    freeze_support()
    Process(target=headBeat).start()
    return 'process'
