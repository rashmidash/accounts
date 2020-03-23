/**
 * Created by 609092482 on 20/03/2020.
 */

var app = angular.module("account", []);

app.controller('accountController', function ($scope, $http) {
        $http.get('http://localhost:8080/accounts/listaccount/customerid/001').
            then(function (response) {
                $scope.headers = ["Account Number", "Account Name", "Currency", "Account Type", "Balance Date", "Opening Balance"];
                $scope.accouctresp = response.data;
                return $scope.accouctresp;
            });
        $scope.getAccountNo = function(value){
            $scope.getTransactions({message: value});
        }
        $scope.getTransactions = function (value) {
            $scope.inputAccNo = value.message;
            $http.get('http://localhost:8080/accounts/listtransactions/accountnumber/' + value.message).
                then(function (response) {
                    $scope.transheaders = ["Account Number", "Account Name", "Currency", "Account Type", "Value Date", "Debit Amount", "Credit Amount", "Card Type"];
                    $scope.transactionresp = [];
                    angular.forEach(response.data, function (transResp, key) {
                        if(transResp.accountNumber == value.message ) {
                            $scope.transactionresp.push(transResp);
                        }
                    });
                    return $scope.transactionresp;
                });
        };
    }
);



