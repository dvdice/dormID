<!DOCTYPE html>
<html>
<head>
    <title>DORMID</title>
</head>
<body>
<H1>DORMID</H1><hr>
<h4>Подробная информация о жителе:</h4>
<b>ID:</b> ${resident.ID}<br>
<b>Имя:</b> ${resident.name}<br>
<b>Фамилия:</b> ${resident.surname}<br>
<hr>
<form action="/resident/delete/${resident.ID}" method="post">
    <input type="submit" value="Удалить жителя"/>
</form>
</body>
</html>
