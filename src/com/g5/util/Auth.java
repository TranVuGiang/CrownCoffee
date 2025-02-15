package com.g5.util;

import com.Entity.NhanVien;
import com.g5.util.Auth;

public class Auth {

    /**
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NhanVien user = null;

    /**
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }

    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }

    /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    public static boolean isManager() {
        return Auth.isLogin() && (user.getVaitro() == 1 || user.getVaitro() == 2); // 1 là trưởng phòng, 2 là chủ
    }

    public static String accountNV(String manv) {
        return ("NV" + manv).trim();
    }

    public static String accountXNNV(String manv) {
        return manv.trim();
    }

}
