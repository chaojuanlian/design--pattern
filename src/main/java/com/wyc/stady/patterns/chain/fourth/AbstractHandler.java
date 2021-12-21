package com.wyc.stady.patterns.chain.fourth;

/**
 * @author wangyuchao
 * @ClassName: AbstractHandler
 * @description:
 * @date 2021/12/21下午3:16
 */
public abstract class AbstractHandler {
    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    /**
     * 执行方法
     * @param member
     */
    public abstract void doHandler(Member member);

    public static class Builder{
        private AbstractHandler head;
        private AbstractHandler tail;
        public Builder addHandler(AbstractHandler handler){
            if (this.head == null){
                this.head = this.tail = handler;
                return this;
            }
            this.tail.setNext(handler);
            this.tail = handler;
            return this;
        }

        public AbstractHandler build(){
            return this.head;
        }
    }
}
