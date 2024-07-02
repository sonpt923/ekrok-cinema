<#--Mẫu email cho quá trình xác minh email.-->
<!DOCTYPE html>
<html lang="ve" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <title>Employee</title>
</head>
<body>
<div style='margin: 0; padding: 0;'>
    <div style='font-family: Roboto, RobotoDraft, Helvetica, Arial, sans-serif; font-size: 14px; width: 100%; background: #fafafa; line-height: 22px; box-sizing: border-box;'>
        <div style='width: 600px; max-width: 100%; background: #fff; border-radius: 6px; margin: 0 auto;'>
            <div style='padding: 0 20px 40px;'>
                <br/>
                <p style='font-weight: normal; font-size: xx-large; margin: 50px 0px; color: #474d57; text-align: center'>
                    EKROK CINEMA
                </p>
                <p style='font-weight: normal; margin: 16px 0 0 0; color: #474d57;'>
                    Mã OTP của quý khách là: <span style='font-weight: 600;'>${otp}</span>.
                </p>
                <p style='font-weight: normal; margin: 16px 0 0 0; color: #474d57;'>
                    Nếu Quý khách không nhận ra hoạt động này, hãy ngay lập tức liên hệ chúng tôi
                </p>
                <p style='font-weight: normal; margin: 16px 0 0 0; color: #474d57;'>
                    Chúc quý khách có trải nghệm tốt nhất!
                </p>
                <p style='font-weight: normal; margin: 0; font-size: 14px; line-height: 22px; color: #76808f; margin-top: 36px;'>
                    Đây là tin nhắn tự động, vui lòng không trả lời.
                </p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
