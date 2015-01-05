$(document).ready(function () {
    var DataSource = function (options) {
        this._formatter = options.formatter;
        this._columns = options.columns;
        this._data = options.data;
        this._delay = options.delay || 0;
    };

    DataSource.prototype = {

        columns: function () {
            return this._columns;
        },

        data: function (options, callback) {

            var self = this;

            setTimeout(function () {

                var data = $.extend(true, [], self._data);

                console.log(options);

                // SEARCHING
                if (options.search) {
                    data = _.filter(data, function (item) {
                        for (var prop in item) {
                            if (!item.hasOwnProperty(prop)) continue;
                            if (~item[prop].toString().toLowerCase().indexOf(options.search.toLowerCase())) return true;
                        }
                        return false;
                    });
                }
                var count = data.length;

                // SORTING
                if (options.sortProperty) {
                    data = _.sortBy(data, options.sortProperty);
                    if (options.sortDirection === 'desc') data.reverse();
                }

                // PAGING
                var startIndex = options.pageIndex * options.pageSize;
                var endIndex = startIndex + options.pageSize;
                var end = (endIndex > count) ? count : endIndex;
                var pages = Math.ceil(count / options.pageSize);
                var page = options.pageIndex + 1;
                var start = startIndex + 1;

                data = data.slice(startIndex, endIndex);

                if (self._formatter) self._formatter(data);

                callback({ data: data, start: start, end: end, count: count, pages: pages, page: page });

            }, this._delay);
        }
    };

    amplify.request.define("iventoryItem", "ajax", {
        url: "/inventoryItem/list.htm",
        dataType: "json",
        type: "GET"
    });


    amplify.request("iventoryItem", function (data) {
        var dataSource = new DataSource({
            columns: [
                {
                    property: 'id',
                    label: 'Id',
                    sortable: false
                },
                {
                    property:'description',
                    label:'Description',
                    sortable:true
                },
                {
                    property: 'price',
                    label: 'Price',
                    sortable: true
                },
                {
                    property: 'onhand',
                    label: 'Onhand',
                    sortable: true
                },
                {
                    property: 'supplierId',
                    label: 'SupplierId',
                    sortable: true
                }
            ],
            data: data,
            delay: 300
        });

    });

    $('#MyGrid').datagrid({
        dataSource: dataSource
    });
});