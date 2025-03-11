<html>
     <body>
          <form method="post">
               <input type="file" name="image" endtype="multipart/form-data">
               <input type="submit" value="upload">
          </form>
     </body>
</html>

<?php
if(isset($_FILES['image'])){
    
     echo "$file_name = $_FILES['image']['name']";
     echo "$file_size = $_FILES['image']['size']";
     echo "$file_tmp = $_FILES['image']['type']";
}
     
?>