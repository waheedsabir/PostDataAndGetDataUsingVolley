
<?php



require "config.php";


$title = $_POST["title"]; 
$detail = $_POST["detail"];


$sql = "INSERT INTO health (title,detail) values ('$title','$detail');";

if(mysqli_query($conn, $sql)){
	
	
	echo "Submit";
}
else {
	
	
	echo "No Submit";
}








?>