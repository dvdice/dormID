<!DOCTYPE html>
<html>
<head>
    <title>DORMID</title>
</head>
<body>
    <H1>DORMID</H1><hr>
    <h4>Список жителей общежития:</h4>
    <#list residents as resident>
        <div>
            <p>${resident.name} ${resident.surname} | <a href="/resident/${resident.ID}">Карточка жителя</a></p>
        </div>
    </#list>
    <hr>
    <h3>Добавление нового жителя</h3>
    <form action="/resident/create" method="post">
        Имя жителя: <input type="text" name="name"><br><br>
        Фамилия жителя: <input type="text" name="surname"><br><br>
        <input type="submit" value="Добавить жителя"/>
    </form>
</body>
</html>
