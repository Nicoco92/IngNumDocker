<?php
header('Content-Type: text/plain');


$name = $_GET['name'] ?? 'Nicolas';

$name = trim($name);

if ($name === "") {
    echo json_encode(["error" => "Paramètre 'name' vide"]);
} else {
    echo $name;
}
?>