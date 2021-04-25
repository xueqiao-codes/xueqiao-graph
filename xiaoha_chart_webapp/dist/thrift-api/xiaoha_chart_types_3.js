//
// Autogenerated by Thrift Compiler (0.9.1)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//


ChartType = {
'HISTORICAL_DATA' : 0,
'SPREAD_MONTH' : 1,
'SPREAD_COMMODITY' : 2,
'FORWARD_CURVE' : 3
};
ChartState = {
'ENABLE' : 0,
'DISABLE' : 1
};
XiaoHaChartErrorCode = {
'TAG_NOT_FOUND' : 1000,
'TAG_EXISTS' : 1001
};
Chart = function(args) {
  this.chartId = null;
  this.xiaohaObjId = null;
  this.chartName = null;
  this.shareKey = null;
  this.url = null;
  this.parentFolderId = null;
  this.tags = null;
  this.createTimestamp = null;
  this.lastModifyTimestamp = null;
  this.chartType = null;
  this.chartState = null;
  this.commodityName = null;
  this.plate = null;
  if (args) {
    if (args.chartId !== undefined) {
      this.chartId = args.chartId;
    }
    if (args.xiaohaObjId !== undefined) {
      this.xiaohaObjId = args.xiaohaObjId;
    }
    if (args.chartName !== undefined) {
      this.chartName = args.chartName;
    }
    if (args.shareKey !== undefined) {
      this.shareKey = args.shareKey;
    }
    if (args.url !== undefined) {
      this.url = args.url;
    }
    if (args.parentFolderId !== undefined) {
      this.parentFolderId = args.parentFolderId;
    }
    if (args.tags !== undefined) {
      this.tags = args.tags;
    }
    if (args.createTimestamp !== undefined) {
      this.createTimestamp = args.createTimestamp;
    }
    if (args.lastModifyTimestamp !== undefined) {
      this.lastModifyTimestamp = args.lastModifyTimestamp;
    }
    if (args.chartType !== undefined) {
      this.chartType = args.chartType;
    }
    if (args.chartState !== undefined) {
      this.chartState = args.chartState;
    }
    if (args.commodityName !== undefined) {
      this.commodityName = args.commodityName;
    }
    if (args.plate !== undefined) {
      this.plate = args.plate;
    }
  }
};
Chart.prototype = {};
Chart.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.chartId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.xiaohaObjId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.chartName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.shareKey = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRING) {
        this.url = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.I64) {
        this.parentFolderId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.SET) {
        var _size0 = 0;
        var _rtmp34;
        this.tags = [];
        var _etype3 = 0;
        _rtmp34 = input.readSetBegin();
        _etype3 = _rtmp34.etype;
        _size0 = _rtmp34.size;
        for (var _i5 = 0; _i5 < _size0; ++_i5)
        {
          var elem6 = null;
          elem6 = input.readString().value;
          this.tags.push(elem6);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.I64) {
        this.createTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 9:
      if (ftype == Thrift.Type.I64) {
        this.lastModifyTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 10:
      if (ftype == Thrift.Type.I32) {
        this.chartType = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 11:
      if (ftype == Thrift.Type.I32) {
        this.chartState = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 12:
      if (ftype == Thrift.Type.STRING) {
        this.commodityName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 13:
      if (ftype == Thrift.Type.STRING) {
        this.plate = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

Chart.prototype.write = function(output) {
  output.writeStructBegin('Chart');
  if (this.chartId !== null && this.chartId !== undefined) {
    output.writeFieldBegin('chartId', Thrift.Type.I64, 1);
    output.writeI64(this.chartId);
    output.writeFieldEnd();
  }
  if (this.xiaohaObjId !== null && this.xiaohaObjId !== undefined) {
    output.writeFieldBegin('xiaohaObjId', Thrift.Type.STRING, 2);
    output.writeString(this.xiaohaObjId);
    output.writeFieldEnd();
  }
  if (this.chartName !== null && this.chartName !== undefined) {
    output.writeFieldBegin('chartName', Thrift.Type.STRING, 3);
    output.writeString(this.chartName);
    output.writeFieldEnd();
  }
  if (this.shareKey !== null && this.shareKey !== undefined) {
    output.writeFieldBegin('shareKey', Thrift.Type.STRING, 4);
    output.writeString(this.shareKey);
    output.writeFieldEnd();
  }
  if (this.url !== null && this.url !== undefined) {
    output.writeFieldBegin('url', Thrift.Type.STRING, 5);
    output.writeString(this.url);
    output.writeFieldEnd();
  }
  if (this.parentFolderId !== null && this.parentFolderId !== undefined) {
    output.writeFieldBegin('parentFolderId', Thrift.Type.I64, 6);
    output.writeI64(this.parentFolderId);
    output.writeFieldEnd();
  }
  if (this.tags !== null && this.tags !== undefined) {
    output.writeFieldBegin('tags', Thrift.Type.SET, 7);
    output.writeSetBegin(Thrift.Type.STRING, this.tags.length);
    for (var iter7 in this.tags)
    {
      if (this.tags.hasOwnProperty(iter7))
      {
        iter7 = this.tags[iter7];
        output.writeString(iter7);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  if (this.createTimestamp !== null && this.createTimestamp !== undefined) {
    output.writeFieldBegin('createTimestamp', Thrift.Type.I64, 8);
    output.writeI64(this.createTimestamp);
    output.writeFieldEnd();
  }
  if (this.lastModifyTimestamp !== null && this.lastModifyTimestamp !== undefined) {
    output.writeFieldBegin('lastModifyTimestamp', Thrift.Type.I64, 9);
    output.writeI64(this.lastModifyTimestamp);
    output.writeFieldEnd();
  }
  if (this.chartType !== null && this.chartType !== undefined) {
    output.writeFieldBegin('chartType', Thrift.Type.I32, 10);
    output.writeI32(this.chartType);
    output.writeFieldEnd();
  }
  if (this.chartState !== null && this.chartState !== undefined) {
    output.writeFieldBegin('chartState', Thrift.Type.I32, 11);
    output.writeI32(this.chartState);
    output.writeFieldEnd();
  }
  if (this.commodityName !== null && this.commodityName !== undefined) {
    output.writeFieldBegin('commodityName', Thrift.Type.STRING, 12);
    output.writeString(this.commodityName);
    output.writeFieldEnd();
  }
  if (this.plate !== null && this.plate !== undefined) {
    output.writeFieldBegin('plate', Thrift.Type.STRING, 13);
    output.writeString(this.plate);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ChartFolder = function(args) {
  this.folderId = null;
  this.xiaohaObjId = null;
  this.folderName = null;
  this.parentFolderId = null;
  this.childFoldIds = null;
  this.tags = null;
  this.createTimestamp = null;
  this.lastModifyTimestamp = null;
  if (args) {
    if (args.folderId !== undefined) {
      this.folderId = args.folderId;
    }
    if (args.xiaohaObjId !== undefined) {
      this.xiaohaObjId = args.xiaohaObjId;
    }
    if (args.folderName !== undefined) {
      this.folderName = args.folderName;
    }
    if (args.parentFolderId !== undefined) {
      this.parentFolderId = args.parentFolderId;
    }
    if (args.childFoldIds !== undefined) {
      this.childFoldIds = args.childFoldIds;
    }
    if (args.tags !== undefined) {
      this.tags = args.tags;
    }
    if (args.createTimestamp !== undefined) {
      this.createTimestamp = args.createTimestamp;
    }
    if (args.lastModifyTimestamp !== undefined) {
      this.lastModifyTimestamp = args.lastModifyTimestamp;
    }
  }
};
ChartFolder.prototype = {};
ChartFolder.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.folderId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.xiaohaObjId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.folderName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.parentFolderId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.SET) {
        var _size8 = 0;
        var _rtmp312;
        this.childFoldIds = [];
        var _etype11 = 0;
        _rtmp312 = input.readSetBegin();
        _etype11 = _rtmp312.etype;
        _size8 = _rtmp312.size;
        for (var _i13 = 0; _i13 < _size8; ++_i13)
        {
          var elem14 = null;
          elem14 = input.readI64().value;
          this.childFoldIds.push(elem14);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.SET) {
        var _size15 = 0;
        var _rtmp319;
        this.tags = [];
        var _etype18 = 0;
        _rtmp319 = input.readSetBegin();
        _etype18 = _rtmp319.etype;
        _size15 = _rtmp319.size;
        for (var _i20 = 0; _i20 < _size15; ++_i20)
        {
          var elem21 = null;
          elem21 = input.readString().value;
          this.tags.push(elem21);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.I64) {
        this.createTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.I64) {
        this.lastModifyTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ChartFolder.prototype.write = function(output) {
  output.writeStructBegin('ChartFolder');
  if (this.folderId !== null && this.folderId !== undefined) {
    output.writeFieldBegin('folderId', Thrift.Type.I64, 1);
    output.writeI64(this.folderId);
    output.writeFieldEnd();
  }
  if (this.xiaohaObjId !== null && this.xiaohaObjId !== undefined) {
    output.writeFieldBegin('xiaohaObjId', Thrift.Type.STRING, 2);
    output.writeString(this.xiaohaObjId);
    output.writeFieldEnd();
  }
  if (this.folderName !== null && this.folderName !== undefined) {
    output.writeFieldBegin('folderName', Thrift.Type.STRING, 3);
    output.writeString(this.folderName);
    output.writeFieldEnd();
  }
  if (this.parentFolderId !== null && this.parentFolderId !== undefined) {
    output.writeFieldBegin('parentFolderId', Thrift.Type.I64, 4);
    output.writeI64(this.parentFolderId);
    output.writeFieldEnd();
  }
  if (this.childFoldIds !== null && this.childFoldIds !== undefined) {
    output.writeFieldBegin('childFoldIds', Thrift.Type.SET, 5);
    output.writeSetBegin(Thrift.Type.I64, this.childFoldIds.length);
    for (var iter22 in this.childFoldIds)
    {
      if (this.childFoldIds.hasOwnProperty(iter22))
      {
        iter22 = this.childFoldIds[iter22];
        output.writeI64(iter22);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  if (this.tags !== null && this.tags !== undefined) {
    output.writeFieldBegin('tags', Thrift.Type.SET, 6);
    output.writeSetBegin(Thrift.Type.STRING, this.tags.length);
    for (var iter23 in this.tags)
    {
      if (this.tags.hasOwnProperty(iter23))
      {
        iter23 = this.tags[iter23];
        output.writeString(iter23);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  if (this.createTimestamp !== null && this.createTimestamp !== undefined) {
    output.writeFieldBegin('createTimestamp', Thrift.Type.I64, 7);
    output.writeI64(this.createTimestamp);
    output.writeFieldEnd();
  }
  if (this.lastModifyTimestamp !== null && this.lastModifyTimestamp !== undefined) {
    output.writeFieldBegin('lastModifyTimestamp', Thrift.Type.I64, 8);
    output.writeI64(this.lastModifyTimestamp);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ReqChartOption = function(args) {
  this.chartIds = null;
  this.xiaohaObjId = null;
  this.parentFolderId = null;
  this.chartType = null;
  this.commodityName = null;
  this.plate = null;
  this.name = null;
  this.keyWords = null;
  if (args) {
    if (args.chartIds !== undefined) {
      this.chartIds = args.chartIds;
    }
    if (args.xiaohaObjId !== undefined) {
      this.xiaohaObjId = args.xiaohaObjId;
    }
    if (args.parentFolderId !== undefined) {
      this.parentFolderId = args.parentFolderId;
    }
    if (args.chartType !== undefined) {
      this.chartType = args.chartType;
    }
    if (args.commodityName !== undefined) {
      this.commodityName = args.commodityName;
    }
    if (args.plate !== undefined) {
      this.plate = args.plate;
    }
    if (args.name !== undefined) {
      this.name = args.name;
    }
    if (args.keyWords !== undefined) {
      this.keyWords = args.keyWords;
    }
  }
};
ReqChartOption.prototype = {};
ReqChartOption.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.SET) {
        var _size24 = 0;
        var _rtmp328;
        this.chartIds = [];
        var _etype27 = 0;
        _rtmp328 = input.readSetBegin();
        _etype27 = _rtmp328.etype;
        _size24 = _rtmp328.size;
        for (var _i29 = 0; _i29 < _size24; ++_i29)
        {
          var elem30 = null;
          elem30 = input.readI64().value;
          this.chartIds.push(elem30);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.xiaohaObjId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.parentFolderId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I32) {
        this.chartType = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.STRING) {
        this.commodityName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 6:
      if (ftype == Thrift.Type.STRING) {
        this.plate = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 7:
      if (ftype == Thrift.Type.STRING) {
        this.name = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 8:
      if (ftype == Thrift.Type.SET) {
        var _size31 = 0;
        var _rtmp335;
        this.keyWords = [];
        var _etype34 = 0;
        _rtmp335 = input.readSetBegin();
        _etype34 = _rtmp335.etype;
        _size31 = _rtmp335.size;
        for (var _i36 = 0; _i36 < _size31; ++_i36)
        {
          var elem37 = null;
          elem37 = input.readString().value;
          this.keyWords.push(elem37);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ReqChartOption.prototype.write = function(output) {
  output.writeStructBegin('ReqChartOption');
  if (this.chartIds !== null && this.chartIds !== undefined) {
    output.writeFieldBegin('chartIds', Thrift.Type.SET, 1);
    output.writeSetBegin(Thrift.Type.I64, this.chartIds.length);
    for (var iter38 in this.chartIds)
    {
      if (this.chartIds.hasOwnProperty(iter38))
      {
        iter38 = this.chartIds[iter38];
        output.writeI64(iter38);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  if (this.xiaohaObjId !== null && this.xiaohaObjId !== undefined) {
    output.writeFieldBegin('xiaohaObjId', Thrift.Type.STRING, 2);
    output.writeString(this.xiaohaObjId);
    output.writeFieldEnd();
  }
  if (this.parentFolderId !== null && this.parentFolderId !== undefined) {
    output.writeFieldBegin('parentFolderId', Thrift.Type.I64, 3);
    output.writeI64(this.parentFolderId);
    output.writeFieldEnd();
  }
  if (this.chartType !== null && this.chartType !== undefined) {
    output.writeFieldBegin('chartType', Thrift.Type.I32, 4);
    output.writeI32(this.chartType);
    output.writeFieldEnd();
  }
  if (this.commodityName !== null && this.commodityName !== undefined) {
    output.writeFieldBegin('commodityName', Thrift.Type.STRING, 5);
    output.writeString(this.commodityName);
    output.writeFieldEnd();
  }
  if (this.plate !== null && this.plate !== undefined) {
    output.writeFieldBegin('plate', Thrift.Type.STRING, 6);
    output.writeString(this.plate);
    output.writeFieldEnd();
  }
  if (this.name !== null && this.name !== undefined) {
    output.writeFieldBegin('name', Thrift.Type.STRING, 7);
    output.writeString(this.name);
    output.writeFieldEnd();
  }
  if (this.keyWords !== null && this.keyWords !== undefined) {
    output.writeFieldBegin('keyWords', Thrift.Type.SET, 8);
    output.writeSetBegin(Thrift.Type.STRING, this.keyWords.length);
    for (var iter39 in this.keyWords)
    {
      if (this.keyWords.hasOwnProperty(iter39))
      {
        iter39 = this.keyWords[iter39];
        output.writeString(iter39);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ReqChartFolderOption = function(args) {
  this.chartFolderIds = null;
  this.xiaohaObjId = null;
  this.parentFolderId = null;
  this.name = null;
  this.keyWords = null;
  if (args) {
    if (args.chartFolderIds !== undefined) {
      this.chartFolderIds = args.chartFolderIds;
    }
    if (args.xiaohaObjId !== undefined) {
      this.xiaohaObjId = args.xiaohaObjId;
    }
    if (args.parentFolderId !== undefined) {
      this.parentFolderId = args.parentFolderId;
    }
    if (args.name !== undefined) {
      this.name = args.name;
    }
    if (args.keyWords !== undefined) {
      this.keyWords = args.keyWords;
    }
  }
};
ReqChartFolderOption.prototype = {};
ReqChartFolderOption.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.SET) {
        var _size40 = 0;
        var _rtmp344;
        this.chartFolderIds = [];
        var _etype43 = 0;
        _rtmp344 = input.readSetBegin();
        _etype43 = _rtmp344.etype;
        _size40 = _rtmp344.size;
        for (var _i45 = 0; _i45 < _size40; ++_i45)
        {
          var elem46 = null;
          elem46 = input.readI64().value;
          this.chartFolderIds.push(elem46);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.xiaohaObjId = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.I64) {
        this.parentFolderId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.STRING) {
        this.name = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.SET) {
        var _size47 = 0;
        var _rtmp351;
        this.keyWords = [];
        var _etype50 = 0;
        _rtmp351 = input.readSetBegin();
        _etype50 = _rtmp351.etype;
        _size47 = _rtmp351.size;
        for (var _i52 = 0; _i52 < _size47; ++_i52)
        {
          var elem53 = null;
          elem53 = input.readString().value;
          this.keyWords.push(elem53);
        }
        input.readSetEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ReqChartFolderOption.prototype.write = function(output) {
  output.writeStructBegin('ReqChartFolderOption');
  if (this.chartFolderIds !== null && this.chartFolderIds !== undefined) {
    output.writeFieldBegin('chartFolderIds', Thrift.Type.SET, 1);
    output.writeSetBegin(Thrift.Type.I64, this.chartFolderIds.length);
    for (var iter54 in this.chartFolderIds)
    {
      if (this.chartFolderIds.hasOwnProperty(iter54))
      {
        iter54 = this.chartFolderIds[iter54];
        output.writeI64(iter54);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  if (this.xiaohaObjId !== null && this.xiaohaObjId !== undefined) {
    output.writeFieldBegin('xiaohaObjId', Thrift.Type.STRING, 2);
    output.writeString(this.xiaohaObjId);
    output.writeFieldEnd();
  }
  if (this.parentFolderId !== null && this.parentFolderId !== undefined) {
    output.writeFieldBegin('parentFolderId', Thrift.Type.I64, 3);
    output.writeI64(this.parentFolderId);
    output.writeFieldEnd();
  }
  if (this.name !== null && this.name !== undefined) {
    output.writeFieldBegin('name', Thrift.Type.STRING, 4);
    output.writeString(this.name);
    output.writeFieldEnd();
  }
  if (this.keyWords !== null && this.keyWords !== undefined) {
    output.writeFieldBegin('keyWords', Thrift.Type.SET, 5);
    output.writeSetBegin(Thrift.Type.STRING, this.keyWords.length);
    for (var iter55 in this.keyWords)
    {
      if (this.keyWords.hasOwnProperty(iter55))
      {
        iter55 = this.keyWords[iter55];
        output.writeString(iter55);
      }
    }
    output.writeSetEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ChartPage = function(args) {
  this.total = null;
  this.page = null;
  if (args) {
    if (args.total !== undefined) {
      this.total = args.total;
    }
    if (args.page !== undefined) {
      this.page = args.page;
    }
  }
};
ChartPage.prototype = {};
ChartPage.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I32) {
        this.total = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size56 = 0;
        var _rtmp360;
        this.page = [];
        var _etype59 = 0;
        _rtmp360 = input.readListBegin();
        _etype59 = _rtmp360.etype;
        _size56 = _rtmp360.size;
        for (var _i61 = 0; _i61 < _size56; ++_i61)
        {
          var elem62 = null;
          elem62 = new Chart();
          elem62.read(input);
          this.page.push(elem62);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ChartPage.prototype.write = function(output) {
  output.writeStructBegin('ChartPage');
  if (this.total !== null && this.total !== undefined) {
    output.writeFieldBegin('total', Thrift.Type.I32, 1);
    output.writeI32(this.total);
    output.writeFieldEnd();
  }
  if (this.page !== null && this.page !== undefined) {
    output.writeFieldBegin('page', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.page.length);
    for (var iter63 in this.page)
    {
      if (this.page.hasOwnProperty(iter63))
      {
        iter63 = this.page[iter63];
        iter63.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ChartFolderPage = function(args) {
  this.total = null;
  this.page = null;
  if (args) {
    if (args.total !== undefined) {
      this.total = args.total;
    }
    if (args.page !== undefined) {
      this.page = args.page;
    }
  }
};
ChartFolderPage.prototype = {};
ChartFolderPage.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I32) {
        this.total = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size64 = 0;
        var _rtmp368;
        this.page = [];
        var _etype67 = 0;
        _rtmp368 = input.readListBegin();
        _etype67 = _rtmp368.etype;
        _size64 = _rtmp368.size;
        for (var _i69 = 0; _i69 < _size64; ++_i69)
        {
          var elem70 = null;
          elem70 = new ChartFolder();
          elem70.read(input);
          this.page.push(elem70);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ChartFolderPage.prototype.write = function(output) {
  output.writeStructBegin('ChartFolderPage');
  if (this.total !== null && this.total !== undefined) {
    output.writeFieldBegin('total', Thrift.Type.I32, 1);
    output.writeI32(this.total);
    output.writeFieldEnd();
  }
  if (this.page !== null && this.page !== undefined) {
    output.writeFieldBegin('page', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.page.length);
    for (var iter71 in this.page)
    {
      if (this.page.hasOwnProperty(iter71))
      {
        iter71 = this.page[iter71];
        iter71.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

XueQiaoTag = function(args) {
  this.tagId = null;
  this.cnName = null;
  this.createTimestamp = null;
  this.lastModifyTimestamp = null;
  if (args) {
    if (args.tagId !== undefined) {
      this.tagId = args.tagId;
    }
    if (args.cnName !== undefined) {
      this.cnName = args.cnName;
    }
    if (args.createTimestamp !== undefined) {
      this.createTimestamp = args.createTimestamp;
    }
    if (args.lastModifyTimestamp !== undefined) {
      this.lastModifyTimestamp = args.lastModifyTimestamp;
    }
  }
};
XueQiaoTag.prototype = {};
XueQiaoTag.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.tagId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cnName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.createTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.lastModifyTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

XueQiaoTag.prototype.write = function(output) {
  output.writeStructBegin('XueQiaoTag');
  if (this.tagId !== null && this.tagId !== undefined) {
    output.writeFieldBegin('tagId', Thrift.Type.I64, 1);
    output.writeI64(this.tagId);
    output.writeFieldEnd();
  }
  if (this.cnName !== null && this.cnName !== undefined) {
    output.writeFieldBegin('cnName', Thrift.Type.STRING, 2);
    output.writeString(this.cnName);
    output.writeFieldEnd();
  }
  if (this.createTimestamp !== null && this.createTimestamp !== undefined) {
    output.writeFieldBegin('createTimestamp', Thrift.Type.I64, 4);
    output.writeI64(this.createTimestamp);
    output.writeFieldEnd();
  }
  if (this.lastModifyTimestamp !== null && this.lastModifyTimestamp !== undefined) {
    output.writeFieldBegin('lastModifyTimestamp', Thrift.Type.I64, 5);
    output.writeI64(this.lastModifyTimestamp);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

ReqTagOption = function(args) {
  this.tagId = null;
  this.cnName = null;
  this.namePartical = null;
  if (args) {
    if (args.tagId !== undefined) {
      this.tagId = args.tagId;
    }
    if (args.cnName !== undefined) {
      this.cnName = args.cnName;
    }
    if (args.namePartical !== undefined) {
      this.namePartical = args.namePartical;
    }
  }
};
ReqTagOption.prototype = {};
ReqTagOption.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.tagId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cnName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 3:
      if (ftype == Thrift.Type.STRING) {
        this.namePartical = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

ReqTagOption.prototype.write = function(output) {
  output.writeStructBegin('ReqTagOption');
  if (this.tagId !== null && this.tagId !== undefined) {
    output.writeFieldBegin('tagId', Thrift.Type.I64, 1);
    output.writeI64(this.tagId);
    output.writeFieldEnd();
  }
  if (this.cnName !== null && this.cnName !== undefined) {
    output.writeFieldBegin('cnName', Thrift.Type.STRING, 2);
    output.writeString(this.cnName);
    output.writeFieldEnd();
  }
  if (this.namePartical !== null && this.namePartical !== undefined) {
    output.writeFieldBegin('namePartical', Thrift.Type.STRING, 3);
    output.writeString(this.namePartical);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

XueQiaoPlate = function(args) {
  this.plateId = null;
  this.cnName = null;
  this.createTimestamp = null;
  this.lastModifyTimestamp = null;
  if (args) {
    if (args.plateId !== undefined) {
      this.plateId = args.plateId;
    }
    if (args.cnName !== undefined) {
      this.cnName = args.cnName;
    }
    if (args.createTimestamp !== undefined) {
      this.createTimestamp = args.createTimestamp;
    }
    if (args.lastModifyTimestamp !== undefined) {
      this.lastModifyTimestamp = args.lastModifyTimestamp;
    }
  }
};
XueQiaoPlate.prototype = {};
XueQiaoPlate.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I64) {
        this.plateId = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.STRING) {
        this.cnName = input.readString().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 4:
      if (ftype == Thrift.Type.I64) {
        this.createTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 5:
      if (ftype == Thrift.Type.I64) {
        this.lastModifyTimestamp = input.readI64().value;
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

XueQiaoPlate.prototype.write = function(output) {
  output.writeStructBegin('XueQiaoPlate');
  if (this.plateId !== null && this.plateId !== undefined) {
    output.writeFieldBegin('plateId', Thrift.Type.I64, 1);
    output.writeI64(this.plateId);
    output.writeFieldEnd();
  }
  if (this.cnName !== null && this.cnName !== undefined) {
    output.writeFieldBegin('cnName', Thrift.Type.STRING, 2);
    output.writeString(this.cnName);
    output.writeFieldEnd();
  }
  if (this.createTimestamp !== null && this.createTimestamp !== undefined) {
    output.writeFieldBegin('createTimestamp', Thrift.Type.I64, 4);
    output.writeI64(this.createTimestamp);
    output.writeFieldEnd();
  }
  if (this.lastModifyTimestamp !== null && this.lastModifyTimestamp !== undefined) {
    output.writeFieldBegin('lastModifyTimestamp', Thrift.Type.I64, 5);
    output.writeI64(this.lastModifyTimestamp);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

XueQiaoTagPage = function(args) {
  this.total = null;
  this.page = null;
  if (args) {
    if (args.total !== undefined) {
      this.total = args.total;
    }
    if (args.page !== undefined) {
      this.page = args.page;
    }
  }
};
XueQiaoTagPage.prototype = {};
XueQiaoTagPage.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.I32) {
        this.total = input.readI32().value;
      } else {
        input.skip(ftype);
      }
      break;
      case 2:
      if (ftype == Thrift.Type.LIST) {
        var _size72 = 0;
        var _rtmp376;
        this.page = [];
        var _etype75 = 0;
        _rtmp376 = input.readListBegin();
        _etype75 = _rtmp376.etype;
        _size72 = _rtmp376.size;
        for (var _i77 = 0; _i77 < _size72; ++_i77)
        {
          var elem78 = null;
          elem78 = new XueQiaoTag();
          elem78.read(input);
          this.page.push(elem78);
        }
        input.readListEnd();
      } else {
        input.skip(ftype);
      }
      break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

XueQiaoTagPage.prototype.write = function(output) {
  output.writeStructBegin('XueQiaoTagPage');
  if (this.total !== null && this.total !== undefined) {
    output.writeFieldBegin('total', Thrift.Type.I32, 1);
    output.writeI32(this.total);
    output.writeFieldEnd();
  }
  if (this.page !== null && this.page !== undefined) {
    output.writeFieldBegin('page', Thrift.Type.LIST, 2);
    output.writeListBegin(Thrift.Type.STRUCT, this.page.length);
    for (var iter79 in this.page)
    {
      if (this.page.hasOwnProperty(iter79))
      {
        iter79 = this.page[iter79];
        iter79.write(output);
      }
    }
    output.writeListEnd();
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};
