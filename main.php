<html>
<head>
<title>PHP</title>
</head>

<body>
	<h1>Nombre</h1>
	<form name="form1" method="post" action="index.php">
		nombre: <input name="Nombre" >
		<input type="submit" name="submit" value="name" >
	</form>

<p>Nombre: </p>
<?php
$nombre=$_POST['Nombre'];
$name=$nombre;
echo $name;
?>
</body>
</html>
