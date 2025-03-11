<html>
     <body>
          <center>
               <h1>Last Visited Time </h1>
          </center>
     </body>
</html>

<?php 
$int = 60*60*24*60+time();
setcookie('lastVisit', date("G:i - m/d/y"), $int);
if(isset($_COOKIE['lastVisit'])){
     echo "Your last visited time was $_COOKIE[lastVisit]";
}
else{
     echo "You've got some stale cookies!";
}
?>