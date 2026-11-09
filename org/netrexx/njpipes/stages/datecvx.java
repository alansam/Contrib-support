/* Generated from 'datecvx.nrx' 1 Oct 2026 17:39:18 [v5.10] */
/* Options: Annotations Comments Decimal Format Java Logo Replace Symbols Trace2 Verbose3 */
package org.netrexx.njpipes.stages;
import java.util.Date;
import java.text.SimpleDateFormat;

 // datecvx.nrx Pipeline stage
/*
 *  Copyright (C) 2020  Jeffrey Hennick, Jeff (at) Jeff (dash) H (dot) com
 *Distributed under the ICU 1.8.1 License with NO WARRANTIES of ANY kind.
 *  See LICENSE for the license and information on using, copying, modifying,
 *  and distributing this program.
 */

/*
 23/ 2/17 Documentation; givehelp(). Jeff Hennick
 20/ 9/12 Fixed NOW. Jeff Hennick
 20/ 8/22 Added NOW. Jeff Hennick
 20/ 6/26 Added NOON & MIDNIGHT options. Jeff Hennick
*/










public class datecvx extends org.netrexx.njpipes.pipes.stage{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(50);
 private static final char[] $04={1,10,7,0,0,0,0,0,1,0,0};
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx(2);
 private static final char[] $06={1,10,3,0,1,2,0};
 private static final char[] $07={2,1,44,10,1,0,1,10,1,1,0};
 private static final netrexx.lang.Rexx $08=netrexx.lang.Rexx.toRexx("class ");
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx('\"');
 private static final netrexx.lang.Rexx $010=netrexx.lang.Rexx.toRexx("noon =");
 private static final netrexx.lang.Rexx $011=netrexx.lang.Rexx.toRexx("\")");
 private static final netrexx.lang.Rexx $012=netrexx.lang.Rexx.toRexx("NOW");
 private static final netrexx.lang.Rexx $013=netrexx.lang.Rexx.toRexx("\"\"year");
 private static final netrexx.lang.Rexx $014=netrexx.lang.Rexx.toRexx("RB");
 private static final netrexx.lang.Rexx $015=netrexx.lang.Rexx.toRexx("RC");
 private static final netrexx.lang.Rexx $016=netrexx.lang.Rexx.toRexx("RN");
 private static final netrexx.lang.Rexx $017=netrexx.lang.Rexx.toRexx("RM");
 private static final netrexx.lang.Rexx $018=netrexx.lang.Rexx.toRexx("  oline =");
 private static final netrexx.lang.Rexx $019=netrexx.lang.Rexx.toRexx("RD");
 private static final netrexx.lang.Rexx $020=new netrexx.lang.Rexx(' ');
 private static final netrexx.lang.Rexx $021=netrexx.lang.Rexx.toRexx("");
 private static final netrexx.lang.Rexx $022=new netrexx.lang.Rexx(',');
 private static final netrexx.lang.Rexx $023=new netrexx.lang.Rexx('\n');
 private static final netrexx.lang.Rexx $024=netrexx.lang.Rexx.toRexx("MET  (2)\n");
 private static final netrexx.lang.Rexx $025=netrexx.lang.Rexx.toRexx("*/\n");
 private static final java.lang.String $0="datecvx.nrx";
 
 protected boolean timeout=new netrexx.lang.Rexx(0).toboolean();
 protected netrexx.lang.Rexx daysInMonth=netrexx.lang.Rexx.toRexx("31 28 31  30  31  30  31  31  30  31  30  31");

 
 // The run method of this stage should never get called
 
 
 @SuppressWarnings("unchecked") 
 public void run() throws org.netrexx.njpipes.pipes.ThreadQ{
  netrexx.lang.Rexx rc;
  rc=new netrexx.lang.Rexx((byte)16);
  exit(rc.toint());
  return;}
  
  /*
   * pInfo    = name of pipe,
   * pInfo[1] = stage number in pipe
   * pInfo[2] = stage label, null if no label
   * pInfo[3] = stage name
   * pInfo[4] = stage arguements
   * pInfo[5] = rest of pipe
   * pInfo[6] = sep
   * pInfo[7] = end
   * pInfo[8] = not modifier active
   * pInfo[9] = stage is a driver
   * code     = ''
   * code[0]  = 0
   *
   * When compilerExit returns with true, the compiler expects:
   *
   * pInfo[2] = stage label
   * pInfo[3] = name of stage
   * pInfo[4] = stage arguements
   * pInfo[5] = rest of the pipe
   * code[0]  = number of lines generated
   * code[n]  = line n
   *
   */
  
 
 
 @SuppressWarnings("unchecked") 
 public boolean stageExit(netrexx.lang.Rexx pInfo,netrexx.lang.Rexx o){
  netrexx.lang.Rexx pid=null;
  netrexx.lang.Rexx name=null;
  netrexx.lang.Rexx args=null;
  netrexx.lang.Rexx noon=null;
  boolean isRange=false;
  org.netrexx.njpipes.pipes.IRange r[]=null;
  netrexx.lang.Rexx wpw=null;
  netrexx.lang.Rexx windowYear=null;
  netrexx.lang.Rexx bpw=null;
  netrexx.lang.Rexx lowYr=null;
  netrexx.lang.Rexx nowYr=null;
  netrexx.lang.Rexx lowC=null;
  netrexx.lang.Rexx highC=null;
  netrexx.lang.Rexx lowY=null;
  netrexx.lang.Rexx tpw=null;
  netrexx.lang.Rexx mpw=null;
  netrexx.lang.Rexx npw=null;
  netrexx.lang.Rexx inF=null;
  netrexx.lang.Rexx outf=null;
  netrexx.lang.Rexx inFormat=null;
  netrexx.lang.Rexx typei=null;
  netrexx.lang.Rexx outFormat=null;
  netrexx.lang.Rexx typeo=null;
  netrexx.lang.Rexx procJul=null;
  netrexx.lang.Rexx n=null;
  netrexx.lang.Rexx cname=null;
  netrexx.lang.Rexx uIR=null;
  netrexx.lang.Rexx sc=null;
  netrexx.lang.Rexx sn=null;
  netrexx.lang.Rexx l=null;
  netrexx.lang.RexxTrace $1=new netrexx.lang.RexxTrace(676,System.err,"datecvx.nrx");
  {try{
   pid=pInfo;
   name=pInfo.getnode(new netrexx.lang.Rexx((byte)3)).leaf;
   args=pInfo.getnode(new netrexx.lang.Rexx((byte)4)).leaf;
   noon=new netrexx.lang.Rexx((byte)0);
   
   
   /* Process stage arguments here for passing to the generated stage */
   
   /* input RANGE */
   r=org.netrexx.njpipes.pipes.IRange.getIRanges(args);
   args=r[0].Residue();
   isRange=(r[0].Number()).OpGt(null,$01);
   
   
   wpw=args.upper().wordpos(netrexx.lang.Rexx.toRexx("WINDOW"));
   if (wpw.OpGt(null,$01)) 
    {
     windowYear=args.word(wpw.OpAdd(null,$02));
     args=args.delword(wpw,new netrexx.lang.Rexx((byte)2));
     if ((windowYear.datatype(new netrexx.lang.Rexx('N'))).OpNot(null)) 
      Emsg(3,netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx("Error - Unknown window number:").OpCcblank(null,windowYear)));
    }
   else 
    windowYear=$03.OpMinus(null);
   
   bpw=args.upper().wordpos(netrexx.lang.Rexx.toRexx("BASEYEAR"));
   if (bpw.OpGt(null,$01)) 
    {
     lowYr=args.word(bpw.OpAdd(null,$02));
     args=args.delword(bpw,new netrexx.lang.Rexx((byte)2));
    }
   else 
    {
     {netrexx.lang.Rexx $2[]=new netrexx.lang.Rexx[2];
     netrexx.lang.RexxParse.parse(new netrexx.lang.Rexx(java.lang.String.valueOf(new Date())),$04,$2);
     nowYr=$2[1];} // 2020
     lowYr=nowYr.OpAdd(null,windowYear); // 1970
    }
   lowC=lowYr.left((lowYr.length()).OpSub(null,$05));
   highC=lowC.OpAdd(null,$02); // 20
   lowY=lowYr.right(new netrexx.lang.Rexx((byte)2)); // 70
   
   /* TIMEOUT */
   tpw=args.upper().wordpos(netrexx.lang.Rexx.toRexx("TIMEOUT"));
   if (tpw.OpGt(null,$01)) 
    {
     timeout=true;
     args=args.delword(tpw,new netrexx.lang.Rexx((byte)1));
    }
   
   /* MIDNIGHT / NOON */
   mpw=args.upper().wordpos(netrexx.lang.Rexx.toRexx("MIDNIGHT")); // really ignore
   if (mpw.OpGt(null,$01)) 
    {
     noon=new netrexx.lang.Rexx((byte)0);
     args=args.delword(mpw,new netrexx.lang.Rexx((byte)1));
    }
   
   npw=args.upper().wordpos(netrexx.lang.Rexx.toRexx("NOON"));
   if (npw.OpGt(null,$01)) 
    {
     noon=new netrexx.lang.Rexx((byte)1);
     args=args.delword(npw,new netrexx.lang.Rexx((byte)1));
    }
   
   /* INPUT and OUTPUT DATE FORMATS */
   {netrexx.lang.Rexx $3[]=new netrexx.lang.Rexx[3];
   netrexx.lang.RexxParse.parse(args,$06,$3);
   inF=$3[0];outf=$3[1];}
   {netrexx.lang.Rexx $4[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getInFormat(inF),$07,$4);
   inFormat=$4[0];typei=$4[1];}
   {netrexx.lang.Rexx $5[]=new netrexx.lang.Rexx[2];
   netrexx.lang.RexxParse.parse(getOutFormat(outf),$07,$5);
   outFormat=$5[0];typeo=$5[1];}
   
   if (netrexx.lang.Rexx.toRexx("JULIAN JULIAN_SHORT RB RC RD").wordpos(typeo).OpGt(null,$01)|netrexx.lang.Rexx.toRexx("JULIAN JULIAN_SHORT RB RC RD").wordpos(typei).OpGt(null,$01)) 
    procJul=new netrexx.lang.Rexx((byte)1);
   else 
    procJul=new netrexx.lang.Rexx((byte)0);
   
   
   /* make the generated stage */
   n=new netrexx.lang.Rexx((byte)0);
   cname=stageName(name,pid,pInfo.getnode(new netrexx.lang.Rexx((byte)1)).leaf);
   
   if (isRange) 
    uIR=netrexx.lang.Rexx.toRexx("uses IRange");
   else 
    uIR=netrexx.lang.Rexx.toRexx("");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=(($08.OpCc(null,cname)).OpCc(null,netrexx.lang.Rexx.toRexx(" extends stage private"))).OpCcblank(null,uIR);
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("--trace results");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("properties public");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("year = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("month = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("mname = Rexx \"\"");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("day = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("doc = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("doy = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("dzero = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("hour = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("min = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("sec = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("secf = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("psec = Rexx 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("pad = 0");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("padpad = pad\"\"pad");
   if (procJul.toboolean()) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=(netrexx.lang.Rexx.toRexx("daysInMonthList = Rexx \"").OpCc(null,daysInMonth)).OpCc(null,$09);
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("daysInMonthCumList = Rexx \'0 31 59 90 120 151 181 212 243 273 304 334 365\'");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("daysInMonth = Rexx 0");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("daysInMonthCum = Rexx 0");
    }
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=$010.OpCcblank(null,noon);
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=(netrexx.lang.Rexx.toRexx("inF = Rexx \"").OpCc(null,inF)).OpCc(null,$09);
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method run()");
   
   /* process arguments */
   
   if (procJul.toboolean()) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("getDaysInMonthCum()");
    }
   
   if (isRange) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=(netrexx.lang.Rexx.toRexx("r = GetIRanges(\"").OpCc(null,pInfo.getnode(new netrexx.lang.Rexx((byte)4)).leaf)).OpCc(null,$011);
    }
   
   /* Main Loop */
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("loop forever");
   if (typei.OpEq(null,$012)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  formatter= java.text.SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss z\")");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  aobj = formatter.format(java.util.Date())");
    }
   else 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  aobj = peekto()");
    }
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  robj = Rexx aobj");
   /* process line */
   
   if (isRange) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  robj = r[1].SelIRange(robj,\" \")");
    }
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse robj").OpCcblank(null,inFormat);
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if year.length = 2 then do");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=(((netrexx.lang.Rexx.toRexx("    if year <").OpCcblank(null,lowY)).OpCcblank(null,netrexx.lang.Rexx.toRexx("then year ="))).OpCcblank(null,highC)).OpCc(null,$013);
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=(netrexx.lang.Rexx.toRexx("    else year =").OpCcblank(null,lowC)).OpCc(null,$013);
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if sec <> \"\" then sec = sec / 1");
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if \\(year\"\"month\"\"day).datatype(\"D\") then do");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    unknown(aobj)");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    iterate");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
   
   if (netrexx.lang.Rexx.toRexx("PIPE PIPE_SHORT").wordpos(typei).OpGt(null,$01)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  sec = (sec\'.\'secf) / 1");
    }
   
   if (netrexx.lang.Rexx.toRexx("JULIAN JULIAN_SHORT").wordpos(typei).OpGt(null,$01)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse JulianAdjDays(year, doy) year \".\" doy");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse MDFromJulianDay(doy, isLeapYear(year)) month day");
    }
   
   if ($014.OpEq(null,typei)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  dzero = JulianFromDays(doc)");
    }
   
   if ($015.OpEq(null,typei)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse JulianFromDays(doc) year \".\" doy");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse MDFromJulianDay(doy, isLeapYear(year)) month day");
    }
   
   if (netrexx.lang.Rexx.toRexx("ISO_SHORT RO").wordpos(typeo).OpGt(null,$01)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  year = (pad\"\"year).right(2)");
    }
   
   if (typei.OpEq(null,$016)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  month = \'Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec\'.wordpos(mname)");
    }
   
   if (typeo.OpEq(null,$017)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  mname = \'January February March April May June July August September October November December\'.word(month)");
    }
   else 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  day = (pad\"\"day).right(2)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  month = (pad\"\"month).right(2)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if hour\"\"min\"\"sec = \"\" & noon then hour = 12");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  hour = (padpad\"\"hour).right(2)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  min = (padpad\"\"min).right(2)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse sec s \".\" f");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  s = (padpad\"\"s).right(2)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if f <> \"\" then sec = s\".\"f");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  else sec = s");
     if (netrexx.lang.Rexx.toRexx("PIPE PIPE_SHORT").wordpos(typeo).OpGt(null,$01)) 
      {
       n=n.OpAdd(null,$02);
       o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  sec = s\"\"(f).strip(\"T\",\"0\")");
      }
    }
   
   if (netrexx.lang.Rexx.toRexx("JULIAN JULIAN_SHORT RD").wordpos(typeo).OpGt(null,$01)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("month=month;day=day;year=year");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("doy = dayOfYear(day, month, year)");
    }
   
   if (netrexx.lang.Rexx.toRexx("USA RE RO PIPE_SHORT EUR_SHORT JULIAN_SHORT").wordpos(typeo).OpGt(null,$01)) 
    { // 2 digit year
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  year = year.right(2)");
    }
   
   if (typeo.OpEq(null,$014)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  basedays = gregDayNumber(day, month, year)");
    }
   
   if (typeo.OpEq(null,$015)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("doy = dayOfYear(day, month, year)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("ld = year.right(2) % 4");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("doc = year.right(2) * 365 + ld + doy");
    }
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=$018.OpCcblank(null,outFormat);
   
   if (isRange) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  line = Rexx aobj");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse getPrePostRange(r[1], line) left \",\" right");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  oline = left\"\"oline\"\"right");
    }
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  output(oline)");
   if (typei.OpEq(null,$012)) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  leave");
    }
   else 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  readto()");
    }
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("catch StageError");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  rc = rc()");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("end");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("exit(rc*(rc<>12))");
   
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method unknown(aobj = java.lang.Object) signals ThreadQ");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  do");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    selectOutput(1)");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    output(aobj)");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    selectOutput(0)");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    readto()");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  catch stageError");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    say \"Could not convert date:\' \"aobj\"\' to\" inF\".\"");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    exit 11");
   n=n.OpAdd(null,$02);
   o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
   
   if (isRange) 
    {
     /* this method should/will be incorporated into IRange, but for now has to be here */
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method getPrePostRange(ro=IRange, line)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  sc = ro.startChar()");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  ec = ro.endChar() + 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  parse line left =(sc) . =(ec) right");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return left\",\"right");
    }
   
   if (procJul.toboolean()) 
    {
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method gregDayNumber(d, m, y)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if m < 3 then y=y-1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if m < 3 then m=m+12");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return Math.floor(365.25*y)-Math.floor(y/100)+Math.floor(y/400)+Math.floor(30.6*(m+1))+d-62");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method getDaysInMonthCum()");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  loop i = 1 to 12");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    daysInMonthCum[i,0] = daysInMonthCumList.word(i)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    daysInMonthCum[i,1] = daysInMonthCumList.word(i)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    daysInMonth[i] = daysInMonthList.word(i)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  loop i = 3 to 12");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    daysInMonthCum[i,1] = daysInMonthCum[i,1] + 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method dayOfYear(daya, montha, yeara)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  doy = daysInMonthCum[montha / 1, isLeapYear(yeara)] + daya");
     if (typeo.OpEq(null,$019)) 
      {
       n=n.OpAdd(null,$02);
       o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  doy = doy / 1");
      }
     else 
      {
       n=n.OpAdd(null,$02);
       o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  doy = (\"000\"doy).right(3)");
      }
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return doy");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method isLeapYear(yeara)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if yeara // 400 = 0 then return 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if (yeara // 4 = 0) & (yeara // 100 <> 0) then return 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return 0");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method LeapDaysBefore(yeara)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return ((yeara-1)%4 - (yeara-1)%100 + (yeara-1)%400);");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method JulianAdjDays(years, days)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  loop");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    diy = 365");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    if isLeapYear(years) then diy = 366");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    if days < diy then leave");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    days = days - diy");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    years = years + 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  loop");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    diy = 365");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    if isLeapYear(years - 1) then diy = 366");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    if days > 0 then leave");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    days = days + diy");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    years = years - 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return years\".\"days");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method JulianFromDays(days = Rexx)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  DAYS_IN_400_YEARS = (400*365) + 97");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  years4 = (days % DAYS_IN_400_YEARS) * 400;");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  days = days // DAYS_IN_400_YEARS");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  DAYS_IN_100_YEARS = (100*365) + 24");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if days < DAYS_IN_100_YEARS then short = 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  else short = 0");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  years = years4 + 100 * (days % DAYS_IN_100_YEARS) + short");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return years\".\"days");
     
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("method MDFromJulianDay(jd,isleap)");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  list = daysInMonth");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  if isleap then list[2] = 29");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  loop m = 1 to 12 while jd > 0");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("    jd = jd - list[m]");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  end");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  m = m - 1");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  jd = jd + list[m]");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  list[2] = 28");
     n=n.OpAdd(null,$02);
     o.getnode(n).leaf=netrexx.lang.Rexx.toRexx("  return m jd");
    
    }
   
   
   /* End of code */
   
   o.getnode(new netrexx.lang.Rexx((byte)0)).leaf=n;
   
   pInfo.getnode(new netrexx.lang.Rexx((byte)3)).leaf=cname;
   pInfo.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("arg(_)"); // magic passthru value for arg()
   
   /* show off the generated code */
   $1.newlevel(0);
   sc=new netrexx.lang.Rexx((byte)0);
   //  sc = 1 -- comment out to not show the code
   sn=new netrexx.lang.Rexx((byte)0);
   sn=new netrexx.lang.Rexx((byte)1); // comment out to not show line numbers
   if (sc.toboolean()) 
    {
     netrexx.lang.RexxIO.Say("*************************************************************");
     {int $6=(o.getnode(new netrexx.lang.Rexx((byte)0)).leaf).OpPlus(null).toint();n=new netrexx.lang.Rexx((byte)1);n:for(;$6>0;$6--,n=n.OpAdd(null,new netrexx.lang.Rexx(1))){
      if (sn.toboolean()) 
       l=(n.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$020);
      else 
       l=netrexx.lang.Rexx.toRexx("");
      netrexx.lang.RexxIO.Say((l.OpCc(null,$021)).OpCc(null,o.getnode(n).leaf));
      }
     }/*n*/
     netrexx.lang.RexxIO.Say("*************************************************************");
    }
  }
  catch (org.netrexx.njpipes.pipes.ThreadQ $7){
  }}
  return true;
  }
 
 
 @SuppressWarnings("unchecked") 
 public netrexx.lang.Rexx getInFormat(netrexx.lang.Rexx name){
  netrexx.lang.Rexx type;
  netrexx.lang.Rexx p=null; //signals ThreadQ
  type=name.upper();
  {/*select*/
  if (type.OpEqS(null,netrexx.lang.Rexx.toRexx(""))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDAT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDA"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHOR"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("USA_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_U"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXU"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RU"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("FULLDATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("USA")))
   p=netrexx.lang.Rexx.toRexx("month . \'/\' day . \'/\' year hour . \':\' min . \':\' sec ."); // mm/dd/yy hh:mm:ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODAT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODA"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISOD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISO_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("NOW")))
   p=netrexx.lang.Rexx.toRexx("year . \'-\' month . \'-\' day hour . \':\' min . \':\' sec ."); // yy . '-' mm . '-' dd hh . ':' mm . ':' ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("DB2"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("DB2_SHORT")))
   p=netrexx.lang.Rexx.toRexx("year . \'-\' month . \'-\' day . \'-\' hour . \'.\' min . \'.\' sec ."); // yy . '-' mm . '-' dd . '-' hh.mm.ss.uuuuuu
   /* not working   6/2020
       when 'REXX_DATE_B', 'REXXB', 'RB'
         then do
           p = "doc hour . ':' min . ':' sec ." -- daydddddddd hh . ':' mm . ':' ss.uuuuuu
           type = 'RB'
         end
   */
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_C"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXC"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RC")))
   {
    p=netrexx.lang.Rexx.toRexx("doc . \'/\' hour . \':\' min . \':\' sec ."); // daydddddddd/hh . ':' mm . ':' ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RC");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_D"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RD")))
   {
    p=netrexx.lang.Rexx.toRexx("doy hour . \':\' min . \':\' sec ."); // dayd hh . ':' mm . ':' ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RD");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXE_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RE_LONG")))
   p=netrexx.lang.Rexx.toRexx("day . \'/\' month . \'/\' year hour . \':\' min . \':\' sec"); // mm/dd/yy hh:mm:ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_J"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXJ"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RJ")))
   p=netrexx.lang.Rexx.toRexx("year +2 doy +3 hour . \':\' min . \':\' sec ."); // mm/dd/yy hh:mm:ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_J_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXJ_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RJ_LONG")))
   p=netrexx.lang.Rexx.toRexx("year +4 doy +3 hour . \':\' min . \':\' sec ."); // mm/dd/yy hh:mm:ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("NORMAL"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_N"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXN"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RN"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_N_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXN_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RN_SHORT")))
   {
    p=netrexx.lang.Rexx.toRexx("day mname year hour . \':\' min . \':\' sec ."); // dd mmm yy hh . ':' mm . ':' ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RN");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_O"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_O_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXO_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RO_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("CSL"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("CSL_SHORT")))
   p=netrexx.lang.Rexx.toRexx("year . \'/\' month . \'/\' day hour . \':\' min . \':\' sec ."); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_S_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXS_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RS_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("PIPE")))
   {
    p=netrexx.lang.Rexx.toRexx("year +4 month +2 day +2 hour +2 min +2 sec +2 secf .");
    type=netrexx.lang.Rexx.toRexx("PIPE");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("PIPE_SHORT")))
   p=netrexx.lang.Rexx.toRexx("year +2 month +2 day +2 hour +2 min +2 sec +2 secf .");
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("EUR"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("EUR_SHORT")))
   p=netrexx.lang.Rexx.toRexx("day . \'.\' month . \'.\' year hour . \':\' min . \':\' sec ."); // dd.mm.yy hh . ':' mm . ':' ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("JULIAN"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("JULIAN_SHORT")))
   p=netrexx.lang.Rexx.toRexx("year . \'.\' doy hour . \':\' min . \':\' sec ."); // yy.dayd hh . ':' mm . ':' ss.uuuuuu
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("POSIX")))
   {
    p=netrexx.lang.Rexx.toRexx("psec");
    type=netrexx.lang.Rexx.toRexx("POSIX");
   }
  else{
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("DateConvert Input format").OpCcblank(null,name)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is not recognized.")));
   {System.exit(11);return null;}
  }
  }
  return (p.OpCc(null,$022)).OpCc(null,type);
  }
 
 
 @SuppressWarnings("unchecked") 
 public netrexx.lang.Rexx getOutFormat(netrexx.lang.Rexx name){
  netrexx.lang.Rexx type;
  netrexx.lang.Rexx p=null;
  type=name.upper();
  {/*select*/
  if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDAT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTDA"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORTD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHOR"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("SHO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("USA_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_U"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXU"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RU"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("FULLDATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("USA")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("month\'/\'day\'/\'year hour\':\'min\':\'sec"); // mm/dd/yy hh:mm:ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("month\'/\'day\'/\'year"); // mm/dd/yy hh:mm:ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("USA");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISO_SHORT")))
   {if (timeout) 
    p=netrexx.lang.Rexx.toRexx("year\'-\'month\'-\'day hour\':\'min\':\'sec"); //  yyyyyyy-mm-dd hh:mm:ss.uuuuuu
   else 
    p=netrexx.lang.Rexx.toRexx("year\'-\'month\'-\'day"); //  yyyyyyy-mm-dd hh:mm:ss.uuuuuu
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx(""))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODATE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODAT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISODA"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISOD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("ISO")))
   {if (timeout) 
    p=netrexx.lang.Rexx.toRexx("year\'-\'month\'-\'day hour\':\'min\':\'sec"); //  yyyyyyy-mm-dd hh:mm:ss.uuuuuu
   else 
    p=netrexx.lang.Rexx.toRexx("year\'-\'month\'-\'day"); //  yyyyyyy-mm-dd hh:mm:ss.uuuuuu
   }/* not working 6/2020
       when 'REXX_DATE_B', 'REXXB', 'RB'
         then do
           if timeout then
             p = "basedays hour':'min':'sec"
           else
             p = 'basedays'
           type = 'RB'
         end
   */
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_C"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXC"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RC")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("doc\'/\'hour\':\'min\':\'sec");
    else 
     p=netrexx.lang.Rexx.toRexx("doc");
    type=netrexx.lang.Rexx.toRexx("RC");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_D"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXD"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RD")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("doy hour\':\'min\':\'sec");
    else 
     p=netrexx.lang.Rexx.toRexx("doy");
    type=netrexx.lang.Rexx.toRexx("RD");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RE")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("day\'/\'month\'/\'year hour\':\'min\':\'sec"); // mm/dd/yy hh:mm:ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("day\'/\'month\'/\'year"); // mm/dd/yy hh:mm:ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RE");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXE_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RE_LONG")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("day\'/\'month\'/\'year hour\':\'min\':\'sec"); // mm/dd/yy hh:mm:ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("day\'/\'month\'/\'year"); // mm/dd/yy hh:mm:ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RE_LONG");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_M"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXM"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RM")))
   {
    p=netrexx.lang.Rexx.toRexx("mname"); // mmmmmmmmmmmmm
    type=netrexx.lang.Rexx.toRexx("RM");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_O"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RO"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("CSL_SHORT")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day hour\':\'min\':\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RO");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_O_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXO_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RO_LONG")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day hour\':\'min\':\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    type=netrexx.lang.Rexx.toRexx("RO_LONG");
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("CSL")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day hour\':\'min\':\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("year\'/\'month\'/\'day"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_S_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXS_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RS_LONG"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("PIPE"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("PIPE_SHORT"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXX_DATE_S"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("REXXS"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("RS")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("year\'\'month\'\'day\'\'hour\'\'min\'\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("year\'\'month\'\'day"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("EUR"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("EUR_SHORT")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("day\'.\'month\'.\'year\' \'hour\':\'min\':\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("day\'.\'month\'.\'year"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
   }
  else if (type.OpEqS(null,netrexx.lang.Rexx.toRexx("JULIAN"))||type.OpEqS(null,netrexx.lang.Rexx.toRexx("JULIAN_SHORT")))
   {
    if (timeout) 
     p=netrexx.lang.Rexx.toRexx("year\'.\'doy\' \'hour\':\'min\':\'sec"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
    else 
     p=netrexx.lang.Rexx.toRexx("year\'.\'doy"); // yy . '/' mm . '/' dd hh . ':' mm . ':' ss.uuuuuu
   }
  else{
   netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("DateConvert Output format").OpCcblank(null,name)).OpCcblank(null,netrexx.lang.Rexx.toRexx("is not recognized.")));
   {System.exit(11);return null;}
  }
  }
  return (p.OpCc(null,$022)).OpCcblank(null,type);
  }
 
 
 @SuppressWarnings("unchecked") 
 public static netrexx.lang.Rexx givehelp(){
  return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((netrexx.lang.Rexx.toRexx("/** datecvx -- Convert Date Formats\n").OpCcblank(null,netrexx.lang.Rexx.toRexx("                              (3)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("                 +-- 1-* ------------------------+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(">>--DATEVX-------+-------------------------------+--------------------------->\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("                 +-| Separator |--| Inputrange |-+\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("    +-SHOrtdate ISOdate---------------------+  +-WINDOW -50------------+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(">---+---------------------------------------+--+-----------------------+------>\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    |                    +-ISOdate----------+  +-WINDOW--signednumber--+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    +-| Inputformat |-+--+------------------+  +-BASEYEAR--yearnumber--+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("    +--NOW--(5)-------+  +-| Outputformat |-+\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("                  +--MIDNIGHT--(4)-+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(">--+-----------+--+----------------+---------------------------------------->>\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   +--TIMEOUT--+  +--NOON--(4)-----+\n"))).OpCcblank(null,$023)).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Separator:  (3)\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("|--+---------------------------------------+--|\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   +--+--WORDSEParator---+--+--char-----+--+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("      +--WS--------------+  +--hexchar--+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("      +--FIELDSEparator--+  +--BLANK----+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("      +--FS--------------+  +--SPACE----+\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Inputrange:  (3)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("|--+--Words-(1)-wnumberrange---+--|\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   +--Fields-(1)-fnumberrange--+\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("   +--cnumberrange-------------+\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(1): SPACE is optional here.\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("(3): NetRexx Pipelines uses IRange which gives a superset of range options.\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("(4): NetRexx Pipelines only. What time to assume if blank time on input.\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("(5): NetRexx Pipelines only. Do NOT read input stream. Use current local date time.\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("     Any Inputrange is ignored.\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Inputformat, Outputformat:\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SHOrtdate     }   mm/dd/yy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("USA_SHORT     }\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_U   }\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("FULldate      }   mm/dd/yyyyyyy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("USA           }\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("ISO_SHORT         yy-mm-dd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("ISOdate           yyyyyyy-mm-dd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("DB2_SHORT         yy-mm-dd-hh.mm.ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("DB2               yyyyyyy-mm-dd-hh.mm.ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("VMDATE  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("NORMAL            dd mmm yyyyyyy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("CSL_SHORT     }   yy/mm/dd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_O   }\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("CSL               yyyyyyy/mm/dd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("PIPE_SHORT        yymmddhhmmssuuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("PIPE          }   yyyymmddhhmmssuuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_S   }\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("EURSHORT          dd.mm.yy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("EUR               dd.mm.yyyyyyy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("JULIAN_SHORT      yy.ddd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("JULIAN            yyyyyyy.ddd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("TOD_ABSOLUTE }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("TODABS       }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SCIENTIFIC_ABSOLUTE }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SCIABS              }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("POSIX             ssssssss\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("TOD_RELATIVE }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("TODREL       }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SCIENTIFIC_RELATIVE }  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("SCIREL              }  (2)\n"))).OpCcblank(null,$024)).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("The following can be REXX_DATE_x, REXXx, or Rx\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_B  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_C  (2)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_D       ddd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E       dd/mm/yy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_E_LONG  dd/mm/yyyyyyy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_J       yyddd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_J_LONG  yyyyddd hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_M       mmmmmmmmm (output only)\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_N_SHORT dd mmm yy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_N       dd mmm yyyy hh:mm:ss.uuuuuu\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx("REXX_DATE_W       wwwwwwwww (output only)\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("(2) Not implemented in NetRexx Pipelines at this time; mainly mainframe useful only.\n"))).OpCcblank(null,$023)).OpCcblank(null,netrexx.lang.Rexx.toRexx("Bad date records out on secondary, NetRexx Pipelines is more forgiving on input format:\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(" _LONG, _SHORT, and normal can all read either 2- or 4-digit years and process per the\n"))).OpCcblank(null,netrexx.lang.Rexx.toRexx(" format; leading zeros/blanks can be ignored except where there is no punctuation.\n"))).OpCcblank(null,$023)).OpCcblank(null,$025);
  }
 
 
 public datecvx(){return;}
 }


























































































