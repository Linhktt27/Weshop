Feature: Test Search
Background: 
    Given Truy cập website https://weshop.com.vn
Scenario: Tìm kiếm với keyword không tồn tại
    When Chọn vào textbox Search và nhập keyword là wswswswswsw2323
    Then Hiển thị thông báo không có kết quả tìm kiếm
Scenario: Tìm kiếm với keyword chính xác
    When Chọn vào textbox Search và nhập keyword là laptop
    Then Hiển thị kết quả tìm kiếm chính xác cho Ebay và Amazon
Scenario: Tìm kiếm với keyword là mã sản phẩm
    When Chọn vào textbox Search và nhập keyword là 222369959833
    Then Hiển thị kết quả tìm kiếm chính xác theo sku
Scenario: Tìm kiếm với keyword là link sản phẩm
    When Chọn vào textbox Search và nhập keyword là https://www.ebay.com/itm/222369959833
    Then Truy cập vào trang detail sản phẩm tìm được
Scenario: Tìm kiếm theo danh mục Ebay
    When Chọn vào 1 danh mục Ebay trên trang Home
    Then Hiển thị kết quả tìm kiếm chính xác theo danh mục Ebay
Scenario: Tìm kiếm theo danh mục Amazon
    When Chọn vào 1 danh mục Amazon trên trang Home
    Then Hiển thị kết quả tìm kiếm chính xác theo danh mục Amazon
Scenario: Tìm kiếm theo seller
    When Truy cập vào 1 trang chi tiết sản phẩm ebay
    And Chọn vào seller
    Then Hiển thị kết quả tìm kiếm chính xác theo seller
Scenario: Fillter theo giá từ thấp đến cao
    When Chọn vào textbox search và nhập keyword là tablet
    And Chọn sắp xếp theo giá từ thấp đến cao
    Then Hiển thị kết quả tìm kiếm chính xác theo giá từ thấp đến cao
Scenario: Fillter theo khoảng giá
    When Chọn vào textbox search và nhập keyword là clothes
    And Chọn tìm kiếm theo khoảng giá 500.000 - 1.000.000 VNĐ
    Then Hiển thị kết quả tìm kiếm chính xác theo giá nằm trong khoảng 500.000 - 1.000.000 VNĐ
Scenario: Fillter theo tình trạng hàng
    When Chọn vào textbox search và nhập keyword là speaker bluetooth
    And Chọn tìm kiếm theo hàng có tình trạng Used
    Then Hiển thị kết quả tìm kiếm chính xác các sản phẩm Used
Scenario: Fillter keyword kèm danh mục
    When Chọn vào textbox search và nhập keyword là speaker
    And Chọn 1 danh mục nằm trong keyword
    Then Hiển thị kết quả tìm kiếm chính xác theo cả keyword và danh mục 
Scenario: Fillter keyword kèm seller
    When Truy cập vào 1 link seller
    And Nhập keyword và chọn search
    Then Hiển thị kết quả tìm kiếm chính xác theo cả seller và keyword
Scenario: Fillter danh mục kèm seller
    When Truy cập vào trang seller
    And Chọn danh mục và Search
    Then Hiển thị kết quả tìm kiếm chính xác theo cả seller và danh mục