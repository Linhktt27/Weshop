$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/Weshop/src/test/java/features/CreateOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Kiểm thu mua hàng",
  "description": "",
  "id": "kiểm-thu-mua-hàng",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "Truy cập website https://weshop.com.vn",
  "keyword": "Given "
});
formatter.match({
  "location": "Buynow.truy_cập_website_https_weshop_com_vn()"
});
formatter.result({
  "duration": 20570064207,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Mua sản phẩm Ebay với số lượng \u003d 1"
    },
    {
      "line": 5,
      "value": "#When Truy cập vào trang chi tiết sản phẩm"
    },
    {
      "line": 6,
      "value": "#And Chọn thuộc tính"
    },
    {
      "line": 7,
      "value": "#And Chọn số lượng"
    },
    {
      "line": 8,
      "value": "#And Chọn BuyNow"
    },
    {
      "line": 9,
      "value": "#And Nhập Tên khách hàng"
    },
    {
      "line": 10,
      "value": "#And Nhập số điện thoại"
    },
    {
      "line": 11,
      "value": "#And Nhập email"
    },
    {
      "line": 12,
      "value": "#And Nhập địa chỉ"
    },
    {
      "line": 13,
      "value": "#And Chọn Thành phố"
    },
    {
      "line": 14,
      "value": "#And Chọn Quận/huyện"
    },
    {
      "line": 15,
      "value": "#And Chọn phương thức thanh toán"
    },
    {
      "line": 16,
      "value": "#And Chọn đồng ý điều khoản, điều kiện"
    },
    {
      "line": 17,
      "value": "#And Chọn button Checkout"
    },
    {
      "line": 18,
      "value": "#Then Show popup thông báo mua hàng thành công"
    }
  ],
  "line": 19,
  "name": "Mua sản phẩm từ Cart",
  "description": "",
  "id": "kiểm-thu-mua-hàng;mua-sản-phẩm-từ-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Truy cập vào trang chi tiết sản phẩm Ebay",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Chọn số lượng sản phẩm",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Chọn Add to Cart sản phẩm Ebay",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Truy cập vào trang chi tiết sản phẩm Amazon",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Chọn thuộc tính và số lượng",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Chọn Add to Cart sản phẩm Amazon",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Truy cập vào Cart và chọn Checkout",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Chọn vào icon Avarta",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Nhập email và password chính xác",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Chọn Login",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Chọn phương thức thanh toán qua Ví Ngân Lượng",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Chọn đồng ý điều khoản, điều kiện Weshop",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Chọn button Thanh toán đơn hàng",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Show popup thông báo mua hàng thành công và link sang cổng thanh toán",
  "keyword": "Then "
});
formatter.match({
  "location": "Buynow.truy_cập_vào_trang_chi_tiết_sản_phẩm_Ebay()"
});
formatter.result({
  "duration": 13113870962,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_số_lượng_sản_phẩm()"
});
formatter.result({
  "duration": 1704052334,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Add_to_Cart_sản_phẩm_Ebay()"
});
formatter.result({
  "duration": 2650580078,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.truy_cập_vào_trang_chi_tiết_sản_phẩm_Amazon()"
});
formatter.result({
  "duration": 28452541997,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_thuộc_tính_và_số_lượng()"
});
formatter.result({
  "duration": 675971312,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Add_to_Cart_sản_phẩm_Amazon()"
});
formatter.result({
  "duration": 2092287797,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.truy_cập_vào_Cart_và_chọn_Checkout()"
});
formatter.result({
  "duration": 14452207416,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_vào_icon_Avarta()"
});
formatter.result({
  "duration": 562989967,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.nhập_email_và_password_chính_xác()"
});
formatter.result({
  "duration": 1327571966,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Login()"
});
formatter.result({
  "duration": 271586449,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_phương_thức_thanh_toán_qua_Ví_Ngân_Lượng()"
});
formatter.result({
  "duration": 8510206578,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_đồng_ý_điều_khoản_điều_kiện_Weshop()"
});
formatter.result({
  "duration": 2115240898,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_button_Thanh_toán_đơn_hàng()"
});
formatter.result({
  "duration": 120697243,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.show_popup_thông_báo_mua_hàng_thành_công_và_link_sang_cổng_thanh_toán()"
});
formatter.result({
  "duration": 20524923642,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@id\u003d\"paymentMessage\"]/div/div/div[2] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-9HE9KP3\u0027, ip: \u0027192.168.197.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\kieul\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 5a9d92bd854ee7e646b6960cc613a5dc\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat createOrder.Buynow.show_popup_thông_báo_mua_hàng_thành_công_và_link_sang_cổng_thanh_toán(Buynow.java:239)\r\n\tat ✽.Then Show popup thông báo mua hàng thành công và link sang cổng thanh toán(D:/workspace/Weshop/src/test/java/features/CreateOrder.feature:33)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1764476493,
  "status": "passed"
});
});