<html>
     <body>
          <?php
               mysql_connect("host","user","password");
               mysql_select_db("dbname");
               $r=$_POST['accno'];
               $query="update account set amount='$_POST[amount]' where accno='$r'";
               if(mysql_query($query))
               {
                    echo "updated";
               }
               else
               {
                    echo "not updated";
               }
          ?>
</html>