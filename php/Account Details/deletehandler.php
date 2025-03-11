<html>
     <body>
          <?php
               mysql_connect("host","user","password");
               mysql_select_db("dbname");
               $r=$_POST['accno'];
               $query="delete from account where accno='$r'";
               if(mysql_query($query))
               {
                    echo "Record Deleted";
               }
               else
               {
                    echo "Unable to delete record / Invalid Entry";
               }
          ?>
</html>