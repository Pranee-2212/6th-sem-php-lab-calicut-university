<html>
     <body>
          <?php
               mysql_connect("host","user","password");
               mysql_select_db("dbname");
               $id=$_POST['id'];
               $name=$_POST['name'];
               $price=$_POST['pricce'];
               $query="insert into product values('$id','$name','$price')";
               mysql_query($query);
               if(mysql_affected_rows()>0){
                    echo"<h3>Product successfully ADDED</h3>";
               }
               else{
                    echo"<h3>Product not inserted</h3>";
               }
          ?>
     </body>
</html>