<html>
     <body>
          <form method="post">
               <select name="fruit">
                    <option value="apple">Apple</option>
                    <option value="banana">Banana</option>
                    <option value="cherry">Cherry</option>
                    <option value="date">Date</option> 
               </select>
               <input type="subbmit" value="submit">


          </form>
     </body>
</html>

<?php

if($_POST){
     echo "<h2>You selected: $_POST['fruit']</h2>" ;
}
?>