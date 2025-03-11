<html>
     <body>
          <?php
               $name = $_POST['name'];
               $position = $_POST['position'];
               $salary = $_POST['salary'];
               switch($position){
                    case manager:
                         $ca=1000;
                         $extra=200;
                         break;
                    case assistant:
                         $ca=500;
                         $extra=100;
                         break;
                    case clerk:     
                         $ca=300;
                         $extra=50;
                         break;
                    default:
                         $ca=0;
                         $extra=0;
                         break;
               }
               $hra=$bs*(25/100);
               $gross=$bs+$hra+$ca+$extra;
               if($gross>10000){
                    $tax=$gross*(10/100);
               }
               elseif($gross>5000){
                    $tax=$gross*(7/100);
               }
               elseif($gross>3000){
                    $tax=$gross*(6/100);
               }
               else{
                    $tax=$gross*(5/100);
               }
               $net=$gross-$tax;
               echo"<center>";
               echo"<h1>Payslip</h1>";
               echo" NAME : $name<br>";
               echo" POSITION : $position<br>";
               echo" SALARY : $salary<br>";
               echo" HRA : $hra<br>";
               echo" CA : $ca<br>";
               echo" EXTRA : $extra<br>";
               echo" GROSS : $gross<br>";
               echo" TAX : $tax<br>";
               echo" NET : $net<br>";
          ?>
     </body>
</html>