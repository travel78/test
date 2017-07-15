<!DOCTYPE html>

<html lang="en" ng-app="myAng">
<head>
    <meta charset="UTF-8"></meta>
    <title>test</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.3/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.min.js"></script>

</head>
<body  ng-controller="cntr" ng-init="loadData()">
<div class="container-fluid" >
    <div class="row">
    <div class="col-lg-3">
       <div class="col-lg-4 col-lg-offset-8">
           <p></p>
        <button class="btn" ng-click="loadData()">Refresh data</button>
       </div>
    </div>
    <div id="result"></div>
    <div class="col-lg-6">
        <table class="table table-striped ">
            <thead>
            <tr>
                <th>Property</th>
                <th>Value</th>

            </tr>
            </thead>
            <tbody>
            <tr>
                <td>id</td>
                <td>{{ticker.id}}</td>

            </tr>
            <tr>
                <td>last</td>
                <td>{{ticker.last}}</td>

            </tr>
            <tr>
                <td>lowestAsk</td>
                <td>{{ticker.lowestAsk}}</td>

            </tr>
            <tr>
                <td>highestBid</td>
                <td>{{ticker.highestBid}}</td>

            </tr>
            <tr>
                <td>percentChange</td>
                <td>{{ticker.percentChange}}</td>

            </tr>
            <tr>
                <td>baseVolume</td>
                <td>{{ticker.baseVolume}}</td>

            </tr>
            <tr>
                <td>quoteVolume</td>
                <td>{{ticker.quoteVolume}}</td>

            </tr>
            <tr>
                <td>isFrozen</td>
                <td ng-if="!ticker.isFrozen">false</td>
                <td ng-if="ticker.isFrozen">true</td>

            </tr>
            <tr>
                <td>high24hr</td>
                <td>{{ticker.high24hr}}</td>

            </tr>
            <tr>
                <td>low24hr</td>
                <td>{{ticker.low24hr}}</td>

            </tr>
            </tbody>
        </table>
    </div>
    </div>
</div>
<script src="js/startStop.js"></script>
</body>
</html>