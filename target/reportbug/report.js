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
  "duration": 20063387359,
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
    },
    {
      "line": 19,
      "value": "#Scenario: Mua sản phẩm từ Cart"
    },
    {
      "line": 20,
      "value": "#When Truy cập vào trang chi tiết sản phẩm Ebay"
    },
    {
      "line": 21,
      "value": "#And Chọn số lượng sản phẩm"
    },
    {
      "line": 22,
      "value": "#And Chọn Add to Cart sản phẩm Ebay"
    },
    {
      "line": 23,
      "value": "#And Truy cập vào trang chi tiết sản phẩm Amazon"
    },
    {
      "line": 24,
      "value": "#And Chọn thuộc tính và số lượng"
    },
    {
      "line": 25,
      "value": "#And Chọn Add to Cart sản phẩm Amazon"
    },
    {
      "line": 26,
      "value": "#And Truy cập vào Cart và chọn Checkout"
    },
    {
      "line": 27,
      "value": "#And Chọn vào icon Avarta"
    },
    {
      "line": 28,
      "value": "#And Nhập email và password chính xác"
    },
    {
      "line": 29,
      "value": "#And Chọn Login"
    },
    {
      "line": 30,
      "value": "#And Chọn phương thức thanh toán qua Ví Ngân Lượng"
    },
    {
      "line": 31,
      "value": "#And Chọn đồng ý điều khoản, điều kiện Weshop"
    },
    {
      "line": 32,
      "value": "#And Chọn button Thanh toán đơn hàng"
    },
    {
      "line": 33,
      "value": "#Then Show popup thông báo mua hàng thành công và link sang cổng thanh toán"
    }
  ],
  "line": 34,
  "name": "Thanh toán từ màn hình bill",
  "description": "",
  "id": "kiểm-thu-mua-hàng;thanh-toán-từ-màn-hình-bill",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "Truy cập vào màn hình bill request",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Chọn button Thanh toán",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Chọn Phương thức Thanh toán qua Chuyển khoản ngân hàng",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Chọn Thanh toán đơn hàng",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Link sang cổng thanh toán thành công",
  "keyword": "Then "
});
formatter.match({
  "location": "Buynow.truy_cập_vào_màn_hình_bill_request()"
});
formatter.result({
  "duration": 8083184311,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_button_Thanh_toán()"
});
formatter.result({
  "duration": 1900946270,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Phương_thức_Thanh_toán_qua_Chuyển_khoản_ngân_hàng()"
});
formatter.result({
  "duration": 4003076917,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Thanh_toán_đơn_hàng()"
});
formatter.result({
  "duration": 605218237,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.link_sang_cổng_thanh_toán_thành_công()"
});
formatter.result({
  "duration": 6096464933,
  "status": "passed"
});
formatter.after({
  "duration": 1261960360,
  "status": "passed"
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
  "duration": 14978681216,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Thanh toán từ màn hình bill addfee",
  "description": "",
  "id": "kiểm-thu-mua-hàng;thanh-toán-từ-màn-hình-bill-addfee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "Truy cập vào màn hình bill addfee",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Chọn button Thanh toán addfee",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Chọn Phương thức Thanh toán qua Visa",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Chọn Thanh toán đơn hàng addfee",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Link sang cổng thanh toán Ngân Lượng thành công",
  "keyword": "Then "
});
formatter.match({
  "location": "Buynow.truy_cập_vào_màn_hình_bill_addfee()"
});
formatter.result({
  "duration": 8095044091,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_button_Thanh_toán_addfee()"
});
formatter.result({
  "duration": 659650721,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Phương_thức_Thanh_toán_qua_Visa()"
});
formatter.result({
  "duration": 1960963184,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.chọn_Thanh_toán_đơn_hàng_addfee()"
});
formatter.result({
  "duration": 409031234,
  "status": "passed"
});
formatter.match({
  "location": "Buynow.link_sang_cổng_thanh_toán_Ngân_Lượng_thành_công()"
});
formatter.result({
  "duration": 5580932148,
  "status": "passed"
});
formatter.after({
  "duration": 1278188170,
  "status": "passed"
});
});