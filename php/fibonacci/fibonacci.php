<html>
     <body>
          <h1> Fibonacci Series</h1>
          <form method="post">
               <input type="text" name="n" placeholder="Enter a number">
               <input type="submit" value="Submit">
          </form>
     </body>
</html>
<?php
if($_SERVER['REQUEST_METHON']=="POST"){
     $n=$_POST['n'];
     $a=0;
     $b=1;
     echo "Fibonacci Series: ";
     echo "$a <br> $b" ;
     for($i=2;$i<$n;$i++){
          $c=$a+$b;
          echo $c.'<br> ';
          $a=$b;
          $b=$c;
     }
}
?>