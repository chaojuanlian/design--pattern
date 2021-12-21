package com.wyc.stady.patterns.chain.fourth;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wangyuchao
 * @ClassName: Member
 * @description:
 * @date 2021/12/21下午3:18
 */
@Data
public class Member {
    private String userName;
    private String password;
    private String rose;

    public Member(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
