<?php
ob_start();
session_start();
?>

<?php
     $u=$_POST['name'];
     $password=$_POST['password'];
     mysql_connect("host","user","password");
     mysql_select_db("dbname");
     $query="select * from login where username='$u' and password='$password'";
     $result=mysql_query($query);
     $row=mysql_fetch_array($result);
     if($row){
         echo "$u  successfully logged in";
     }
     else{
          echo "Invalid username or password";
     }
?>