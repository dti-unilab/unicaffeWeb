<?php



function autoload($classe) {

    $prefix = 'unicaffeWeb';
    $base_dir = 'unicaffeWeb';
    $len = strlen($prefix);
    if (strncmp($prefix, $classe, $len) !== 0) {
        return;
    }
    $relative_class = substr($classe, $len);
    $file = $base_dir . str_replace('\\', '/', $relative_class) . '.php';
    if (file_exists($file)) {
        require $file;
    }

}
spl_autoload_register('autoload');

use unicaffeWeb\controller\MainIndexController;

$index = new MainIndexController();
$index->main();
