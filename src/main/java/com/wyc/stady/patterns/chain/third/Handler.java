package com.wyc.stady.patterns.chain.third;

public abstract class Handler<T> {
    protected Handler nextHandle;

    public void setNextHandle(Handler handler){
        this.nextHandle = handler;
    }

    public abstract void doHandle(Member member);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T>  addHandler(Handler<T> handler) {
                if (this.head == null) {
                    this.head = this.tail = handler;
                    return this;
                }
                this.tail.setNextHandle(handler);
                this.tail = handler;

            return this;
        }

        public Handler<T> build() {
            return this.head;
        }
    }
    
}