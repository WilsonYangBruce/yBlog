package com.masterdream.blogManage.base.result;

public class ResultTool {
    private static ResultEntity tool = ResultEntity.getInstance();

    public static ResultEntity result(Object data) {
        clearData();
        if (data == null) {
            tool.setStatus(HttpResponseCode.FAIL.code);
            tool.setMsg(HttpResponseCode.FAIL.response);
            return tool;
        } else {
            tool.setStatus(HttpResponseCode.OK.code);
            tool.setMsg(HttpResponseCode.OK.response);
            tool.setData(data);
            return tool;
        }
    }

    /**
     * 成功
     */
    public static ResultEntity ok() {
        clearData();
        ok(null);
        return tool;
    }

    public static ResultEntity ok(String msg) {
        clearData();
        tool.setStatus(HttpResponseCode.OK.code);
        tool.setMsg(msg);
        return tool;
    }

    public static ResultEntity ok(Object data) {
        clearData();
        tool.setStatus(HttpResponseCode.OK.code);
        tool.setMsg(HttpResponseCode.OK.response);
        tool.setData(data);
        return tool;
    }

    public static ResultEntity ok(Object data, String msg) {
        clearData();
        tool.setStatus(HttpResponseCode.OK.code);
        tool.setMsg(msg);
        tool.setData(data);
        return tool;
    }

    /**
     * 失败
     */
    public static ResultEntity fail(ResultEntity resultEntity) {
        clearData();
        return resultEntity;
    }

    public static ResultEntity fail() {
        clearData();
        tool.setStatus(HttpResponseCode.FAIL.code);
        tool.setMsg(HttpResponseCode.FAIL.response);
        return tool;
    }

    public static ResultEntity fail(String msg) {
        clearData();
        tool.setStatus(HttpResponseCode.FAIL.code);
        tool.setMsg(msg);
        return tool;
    }

    public static ResultEntity fail(int code) {
        clearData();
        tool.setStatus(code);
        return tool;
    }

    public static ResultEntity fail(HttpResponseCode code) {
        clearData();
        tool.setStatus(code.code);
        tool.setMsg(code.response);
        return tool;
    }

    public static ResultEntity fail(HttpResponseCode code, String msg) {
        clearData();
        tool.setStatus(code.code);
        tool.setMsg(msg);
        return tool;
    }

    public static ResultEntity fail(int code, String msg) {
        clearData();
        tool.setStatus(code);
        tool.setMsg(msg);
        return tool;
    }

    private static void clearData() {
        tool.setStatus(0);
        tool.setMsg("");
        tool.setData(null);
    }

    /**
     * 统一的返回码
     */
    public enum HttpResponseCode {
        OK(200, "成功"),
        FAIL(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        NOT_LOGIN(403, "Forbidden"),
        NOT_FOUND(404, "not found"),
        NO_RIGHT(405, "Method Not Allowed"),
        SERVER_FAIL(500, "服务器错误");
        private int code;
        private String response;

        HttpResponseCode(int code, String response) {
            this.code = code;
            this.response = response;
        }
    }
}
