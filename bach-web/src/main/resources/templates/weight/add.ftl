<html>
	<form action="save" method="post">
		<input name="date" value=${info.date?string('yyyy-MM-dd HH:mm:ss')} />
		<input name="weight" value="${info.weight}" />
		<input type="submit" value="ok"/>
	</form>
</html>