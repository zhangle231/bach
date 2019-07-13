<html>
	<div>
		<div><a href="add">add</a></div>
		<div>list</divt>
		<div>
			<table border="1px">
				<tr>
					<th>date</th>
					<th>weight</th>
				</tr>
				
				<#list list as item>
				<tr>
					<td>${item.date?string('dd.MM.yyyy HH:mm:ss')}</td>
					<td>${item.weight}</td>
				</tr>
				</#list>
			</table>
		</div>
	</div>
</html>