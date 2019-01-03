Feature: Kiểm thu mua hàng
Background: 
  Given Truy cập website https://weshop.com.vn
#Scenario: Mua sản phẩm Ebay với số lượng = 1
  #When Truy cập vào trang chi tiết sản phẩm
  #And Chọn thuộc tính
  #And Chọn số lượng
  #And Chọn BuyNow
  #And Nhập Tên khách hàng
  #And Nhập số điện thoại
  #And Nhập email
  #And Nhập địa chỉ
  #And Chọn Thành phố
  #And Chọn Quận/huyện
  #And Chọn phương thức thanh toán
  #And Chọn đồng ý điều khoản, điều kiện
  #And Chọn button Checkout
  #Then Show popup thông báo mua hàng thành công
Scenario: Mua sản phẩm từ Cart
  When Truy cập vào trang chi tiết sản phẩm Ebay
  And Chọn số lượng sản phẩm
  And Chọn Add to Cart sản phẩm Ebay
  And Truy cập vào trang chi tiết sản phẩm Amazon
  And Chọn thuộc tính và số lượng
  And Chọn Add to Cart sản phẩm Amazon
  And Truy cập vào Cart và chọn Checkout
  And Chọn vào icon Avarta
  And Nhập email và password chính xác
  And Chọn Login
  And Chọn phương thức thanh toán qua Ví Ngân Lượng
  And Chọn đồng ý điều khoản, điều kiện Weshop
  And Chọn button Thanh toán đơn hàng
  Then Show popup thông báo mua hàng thành công và link sang cổng thanh toán
#Scenario: Thanh toán từ màn hình bill
  #When Truy cập vào màn hình bill request
  #And Chọn button Thanh toán
  #And Chọn Phương thức Thanh toán qua Chuyển khoản ngân hàng
  #And Chọn Thanh toán đơn hàng
  #Then Link sang cổng thanh toán thành công
#Scenario: Thanh toán từ màn hình bill addfee
  #When Truy cập vào màn hình bill addfee
  #And Chọn button Thanh toán addfee
  #And Chọn Phương thức Thanh toán qua Visa
  #And Chọn Thanh toán đơn hàng addfee
  #Then Link sang cổng thanh toán Ngân Lượng thành công
