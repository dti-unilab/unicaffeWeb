<!doctype html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- CSRF Token -->
    <meta name="csrf-token" content="{{ csrf_token() }}">

    <title>{{ config('app.name', 'Laravel') }}</title>

    <!-- Scripts -->


    <!-- Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    <link href="{{ asset('css/app.css') }}" rel="stylesheet">
    <!-- Stype to modify the govbar-->
    <style>
        #barra-brasil {
            z-index: 1;
            padding: 0;
            display: block
        }



        #menu-barra-temp {
            list-style: none;
            margin: 0
        }

        #menu-barra-temp li {
            display: inline;
            float: left;
            padding-right: 10px;
            margin-right: 10px;
            border-right: 1px solid #ededed
        }

        #menu-barra-temp a {
            font-family: sans, sans-serif;
            text-decoration: none;
            color: #fff
        }

        #barra-brasil .conteudo-barra-brasil {
            min-height: 40px;
            max-width: 3840px !important;
            width: 97% !important
        }

        #barra-brasil {
            background: #313235 !important;
            border-bottom: 1px solid #313235
        }
    </style>

    <!-- Styles -->

</head>

<body>
    <div id="barra-brasil" style="height: 20px; padding:0 0 0 10px;display:block;">
        <ul id="menu-barra-temp" style="list-style:none;">
            <li
                style="display:inline; float:left;padding-right:10px; margin-right:10px; border-right:1px solid #EDEDED">
                <a href="http://brasil.gov.br"
                    style="font-family:sans,sans-serif; text-decoration:none; color:white;">Portal do Governo Brasileiro</a>
            </li>
        </ul>
    </div>
    <div id="app"></div>
    <script src="{{ asset('js/app.js') }}" defer></script>
    <script defer="defer" src="//barra.brasil.gov.br/barra_2.0.js" type="text/javascript"></script>
</body>

</html>
