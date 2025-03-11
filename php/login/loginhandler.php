<html>
     <body>
          <?php
               mysql_connect("host","user","password");
               mysql_select_db("dbname");
               $r=$_POST['username'];
               $query="select * from login where username='$r' and password='$_POST[password]'";
               $result=mysql_query($query);
               $count=mysql_num_rows($result);
               if($count==1)
               {
                    echo "Login Successful";
                    echo"Welcome $r"
               }
               else
               {
                    echo "Login Failed";
               }
          ?>

     </body>
</html>