<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>历史项目列表</title>

    <!-- CSS核心 -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/css/font-awesome.min.css" rel="stylesheet">
    <link href="/static/css/animate.min.css" rel="stylesheet">

    <!-- CSS插件 -->
    <link href="/static/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="/static/css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="/static/css/plugins/pages/jquery.page.css" rel="stylesheet">

    <!-- CSS页面 -->
    <link href="/static/css/style.min.css" rel="stylesheet">


</head>

<body class="gray-bg">

<div class="wrapper wrapper-content animated fadeIn">


    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>历史项目</h5>
                </div>
                <div class="ibox-content" style="padding:0; border-top:none;">
                    <div class="tab-pane active">
                        <div class="panel-body">
                            <!-- 查询部分 开始 -->
                            <div class="ibox-content" style="padding:15px 0;">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <form class="form-horizontal" name="selected" id="form">
                                            <input type="hidden" name="pageNo" id ="currPage" value = "1"/>
                                            <input type="hidden" name="pageSize" id ="pageSize" value = "10"/>
                                            <input type="hidden" id="pageCount" value = ""/>
                                            <table class="table table-bordered"  >
                                                <tbody>
                                                <tr>
                                                    <td class="input-group-addon" width="20%">项目类型</td>
                                                    <td width="25%">
                                                        <select class="form-control" name="loanType" id="loanType">
                                                            <option value="">全部</option>
                                                            <option value="COMMON">普通出借</option>
                                                            <option value="ADDINTEREST">内部加息</option>
                                                            <option value="NOVICE">新手</option>
                                                            <option value="VIP">出借加密</option>
                                                        </select>
                                                    </td>
                                                    <td class="input-group-addon" width="20%">项目利率</td>
                                                    <td width="25%">
                                                        <div class="input-group">
                                                            <input type="text"  class="form-control" id="yearRate" name="yearRate">
                                                            <span  class="input-group-addon">%</span>
                                                        </div>
                                                    </td>
                                                    <td class="input-group-addon" width="20%">项目开始时间</td>
                                                    <td width="25%">
                                                        <input placeholder="请输入" class="laydate-icon form-control layer-date" id="openTime" name="openTime">
                                                    </td>
                                                    <td class="input-group-addon" width="20%">项目名称</td>
                                                    <td width="25%">
                                                        <input type="text"  class="form-control" id="title" name="title">
                                                    </td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <div class="panel-footer clear">
                                                <div class="pull-right">
                                                    <button class="btn btn-primary btn-xs" type="button" id="srhBtn">
                                                        <i class="fa fa-search-plus"></i>&nbsp;查询
                                                    </button>

                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>

                            <div class="ibox-content" style="padding-bottom:0;">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <!-- 表格部分 开始 -->
                                        <table id="table">
                                            <thead>
                                            <tr>
                                                <th>项目ID</th>
                                                <th>项目类型</th>
                                                <th>项目名称</th>
                                                <th>利率</th>
                                                <th>出借周期</th>
                                                <th>项目总额</th>
                                                <th>已募集</th>
                                                <th>红包使用金额</th>
                                                <th>项目盈收</th>

                                                <th>项目开始时间</th>
                                                <th>募集结束</th>
                                                <th>回收阶段</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <!-- JS输出JOSN数据 -->
                                            </tbody>
                                        </table>
                                        <!-- 表格部分 结束 -->
                                        <div class="ibox-footer clear">
                                            <div class="pull-right">
                                                <!--分页 开始-->
                                                <div class="tcdPageCode" id="tcdPagehide"></div>
                                                <!--分页 结束-->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>


<!-- JS核心 -->
<script src="/static/js/jquery.min.js"></script>
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/content.min.js"></script>

<!-- JS插件 -->
<script src="/static/js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
<script src="/static/js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
<script src="/static/js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
<script src="/static/js/plugins/pages/jquery.page.js"></script>
<script src="/static/js/plugins/layer/laydate/laydate.js"></script>


<!-- JS页面 -->
<script src="/static/js/pages/project/p_history_list.js"></script>

</body>
</html>

