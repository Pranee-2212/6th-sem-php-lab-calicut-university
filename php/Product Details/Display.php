<html>
     <body>
          <?php
               mysql_connect("host","user","password");
               mysql_select_db("dbname");
               $query="select * from product";
               $result=mysql_query($query);
               while($row=mysql_fetch_array($result)){
                    echo"<center>";
                    echo"<h1>Product Details</h1>";
                    echo" ID : ".$row[0]."<br>";
                    echo" NAME : ".$row[1]."<br>";
                    echo" PRICE : ".$row[2]."<br>";
                    echo"</center>";
               }
          ?>
          <input type="button" value="Back" onclick="window.location.href='invertory.html'">
     </body>
</html>