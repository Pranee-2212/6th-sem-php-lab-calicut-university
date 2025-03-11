<?php
     session_start();
     unset($_SESSION['name']);
     unset($_SESSION['password']);
     echo 'You have cleaned session';
     echo "Redirecting in 5 seconds....";
     header('Refresh: 5; URL = loginsession.html');
?>