<html>
     <body>
          <?php
          $r=$_POST['no'];
          mysql_connect("host","user","password");
          mysql_select_db("db_name");

          $query="select * from student where regno='$r'";
          $result=mysql_query($query);
          $row=mysql_fetch_array($result);
          if($row){
               echo"<center>";
               echo"<h1>Result</h1>";
               echo"<p>Name : $row[0]<p>";
               echo"<p>Regno :$row[1]<p>";
               echo"<p>ASP : $row[2]<p>";
               echo"<p>OS :$row[3]<p>";
               echo"<p>network : $row[4]<p>";
               echo"<p>Grage: $row[5]<p>";
          }
          else{
               echo"<center>";
               echo"<h1>Result</h1>";
               echo"<p>Sorry No record found<p>";
          }
          echo"</center>";
          ?>
     </body>
</html>