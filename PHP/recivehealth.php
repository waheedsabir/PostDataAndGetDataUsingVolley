

<?php



require "config.php";


$query = "select * from health ;";


$result = mysqli_query($conn, $query);

$responce= array(); 


while ($row = mysqli_fetch_array($result))
	
	{
		array_push($responce,array(
		
		"id"=>$row[0],
		"title"=>$row[1],
		"detail"=>$row[2],
		
		
		
		
		
		));
		
		
	}

	 ///   echo json_encode (array("record",$responce));
	 
			echo json_encode($responce, JSON_UNESCAPED_SLASHES);







?>