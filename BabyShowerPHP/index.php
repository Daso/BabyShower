<?php
require_once 'Asistente.php';
$asistente1 = new Asistente('Sandra', '15/01/1980');
$asistente2 = new Asistente('Maria', '30/03/1962');

echo $asistente1->preguntarEdad($asistente2);
echo '<br>';
echo $asistente2->preguntarEdad($asistente1);

?>
   
