/* Generated from 'wtvv.nrx' 23 Jul 2026 14:14:01 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Trace2 Verbose3 */


/* NetRexx */


// vector experiments


public class wtvv{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(5);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(3);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(':');
 private static final java.lang.String $0="wtvv.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.util.Vector vec;
  netrexx.lang.Rexx $$_=null;
  netrexx.lang.RexxIO.Say("What\'s the vector Victor?");
  
  vec=new java.util.Vector((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)2),new netrexx.lang.Rexx((byte)7),$01.OpMinus(null)}))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("1: constructor(aslist)  ").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vec))));
  
  vec.addAll(2,(java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)11),$02.OpMinus(null)}))));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("2: addall(aslist)       ").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vec))));
  
  java.util.Collections.sort((java.util.List)vec);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("3: collections.sort     ").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vec))));
  
  java.util.Collections.sort((java.util.List)vec,java.util.Collections.reverseOrder());
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("4: collections sort desc").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vec))));
  
  java.util.Collections.sort((java.util.List)vec);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("5: collections.sort     ").OpCcblank(null,new netrexx.lang.Rexx(java.lang.String.valueOf(vec))));
  netrexx.lang.RexxIO.Say("6: loop over");
  
  {int $3=0;java.lang.Object[] $2=new java.lang.Object[vec.size()];synchronized(vec){java.util.Iterator $1=vec.iterator();for(;;){if($3==$2.length)break;$2[$3]=$1.next();$3++;}}_:for(;;){if(--$3<0)break;$$_=(netrexx.lang.Rexx)((java.lang.Object)$2[$3]);
   netrexx.lang.RexxIO.Say($$_.right(new netrexx.lang.Rexx((byte)3)));
   }
  }/*_*/
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("7: vec.size:").OpCcblank(null,new netrexx.lang.Rexx(vec.size())));
  netrexx.lang.RexxIO.Say("8: loop 0 to N");
  {netrexx.lang.Rexx $4=new netrexx.lang.Rexx(vec.size()).OpSub(null,$03);$$_=new netrexx.lang.Rexx((byte)0);_:for(;$$_.OpLtEq(null,$4);$$_=$$_.OpAdd(null,new netrexx.lang.Rexx(1))){
   netrexx.lang.RexxIO.Say((($$_.right(new netrexx.lang.Rexx((byte)2))).OpCc(null,$04)).OpCcblank(null,((netrexx.lang.Rexx)(vec.get($$_.toint()))).right(new netrexx.lang.Rexx((byte)4))));
   }
  }/*_*/
  return;}
 
 
 private wtvv(){return;}
 }
