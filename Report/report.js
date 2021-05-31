$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/MiruCucumber/org/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enter valid username and valid password and click login",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-enter-valid-username-and-valid-password-and-click-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "enter url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"Mirunalini\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"12345678\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user validate login button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginpgsd.enter_url_of_adactin_application()"
});
formatter.result({
  "duration": 13006324600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mirunalini",
      "offset": 12
    }
  ],
  "location": "loginpgsd.user_enter_as_username(String)"
});
formatter.result({
  "duration": 140967100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678",
      "offset": 12
    }
  ],
  "location": "loginpgsd.user_enter_as_password(String)"
});
formatter.result({
  "duration": 124064800,
  "status": "passed"
});
formatter.match({
  "location": "loginpgsd.user_click_login_button()"
});
formatter.result({
  "duration": 1497468600,
  "status": "passed"
});
formatter.match({
  "location": "loginpgsd.user_validate_login_button()"
});
formatter.result({
  "duration": 69900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User to search hotel with all details",
  "description": "",
  "id": "login-functionality-for-adactin-application;user-to-search-hotel-with-all-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "select location of hotel",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "select hotel type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select room type",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select number of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "enter \"24/06/2021\" as Check in date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "enter \"25/06/2021\" as Check out date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select no of adults",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select number of childrens",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "searchhotelsd.select_location_of_hotel()"
});
formatter.result({
  "duration": 199111200,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.select_hotel_type()"
});
formatter.result({
  "duration": 162941300,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.select_room_type()"
});
formatter.result({
  "duration": 135800500,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.select_number_of_rooms()"
});
formatter.result({
  "duration": 134008300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "24/06/2021",
      "offset": 7
    }
  ],
  "location": "searchhotelsd.enter_as_Check_in_date(String)"
});
formatter.result({
  "duration": 104747200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25/06/2021",
      "offset": 7
    }
  ],
  "location": "searchhotelsd.enter_as_Check_out_date(String)"
});
formatter.result({
  "duration": 101348300,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.select_no_of_adults()"
});
formatter.result({
  "duration": 128084400,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.select_number_of_childrens()"
});
formatter.result({
  "duration": 136053400,
  "status": "passed"
});
formatter.match({
  "location": "searchhotelsd.click_search_button()"
});
formatter.result({
  "duration": 809615400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "selecting hotel",
  "description": "",
  "id": "login-functionality-for-adactin-application;selecting-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Select the hotel",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "selecthotelsd.select_the_hotel()"
});
formatter.result({
  "duration": 92540700,
  "status": "passed"
});
formatter.match({
  "location": "selecthotelsd.click_continue_button()"
});
formatter.result({
  "duration": 1237361000,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "booking a hotel",
  "description": "",
  "id": "login-functionality-for-adactin-application;booking-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Enter \"miru\" as firstname",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "enter \"vignesh\" as lastname",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "enter \"dsvgdbh\" as billing address",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "enter \"1111222233334444\" as card number",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "select card type",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "select exp month",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "select exp year",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "enter cvv num",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "click book now button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "miru",
      "offset": 7
    }
  ],
  "location": "bookhotelsd.enter_as_firstname(String)"
});
formatter.result({
  "duration": 130811700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vignesh",
      "offset": 7
    }
  ],
  "location": "bookhotelsd.enter_as_lastname(String)"
});
formatter.result({
  "duration": 111884800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dsvgdbh",
      "offset": 7
    }
  ],
  "location": "bookhotelsd.enter_as_billing_address(String)"
});
formatter.result({
  "duration": 118445900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1111222233334444",
      "offset": 7
    }
  ],
  "location": "bookhotelsd.enter_as_card_number(String)"
});
formatter.result({
  "duration": 152031900,
  "status": "passed"
});
formatter.match({
  "location": "bookhotelsd.select_card_type()"
});
formatter.result({
  "duration": 137765200,
  "status": "passed"
});
formatter.match({
  "location": "bookhotelsd.select_exp_month()"
});
formatter.result({
  "duration": 130763100,
  "status": "passed"
});
formatter.match({
  "location": "bookhotelsd.select_exp_year()"
});
formatter.result({
  "duration": 134167100,
  "status": "passed"
});
formatter.match({
  "location": "bookhotelsd.enter_cvv_num()"
});
formatter.result({
  "duration": 105495000,
  "status": "passed"
});
formatter.match({
  "location": "bookhotelsd.click_book_now_button()"
});
formatter.result({
  "duration": 80042800,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "conform booking",
  "description": "",
  "id": "login-functionality-for-adactin-application;conform-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 37,
  "name": "click logout button",
  "keyword": "When "
});
formatter.match({
  "location": "conformsd.click_logout_button()"
});
formatter.result({
  "duration": 6824257100,
  "status": "passed"
});
});