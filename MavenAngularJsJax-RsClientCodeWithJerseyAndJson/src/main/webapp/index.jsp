<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AjaxCall</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script>
var app = angular.module("myApp",[]);

app.factory("myFactory", function($http, $q) {
	var object = {
			callServer:function() {
				var pr = $q.defer();
				var url = "http://localhost:8080/MavenJax-RsServerCodeWithJerseyAndJson/webapi/employee/getEmployees";
				$http.get(url).then(function(data) {
					pr.resolve(data.data);
					console.log("Data is Success...",data);
				}, function(err) {
					pr.reject(err);
				});
				return pr.promise;
			}
	}
	return object;
});

app.controller("myController", function($scope, myFactory) {
	$scope.getEmployees = function() {
		var promise = myFactory.callServer();
		promise.then(function(data) {
			$scope.result = data;
		}, function(err) {
			$scope.result = err;
		})
	}
});
</script>
</head>
<body ng-app="myApp" ng-controller="myController">

<h1 style="text-align: center;">Welcome To AngularJs Server Call</h1>

<button type="submit" ng-click="getEmployees()" class="btn btn-info">
Get All Employees Records
</button>
<br />
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<ul>
				<li ng-repeat="e in result">
					{{ e.id + ', ' + e.name }}
				</li>
			</ul>
		</div>
	</div>
</div>
</body>
</html>
