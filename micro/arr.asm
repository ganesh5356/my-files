 area addition,code,readonly
	
	   mov r5,#3
	   mov r0,#0
	   ldr r1,=value1
loop  ldr r2,[r1],#2
	   ldr r3,mask
	   AND r2,r2,r3
	   add r0,r0,r2
	   subs r5,r5,#1
	   cmp r5,#0
	   bne loop
	   ldr r4,=result
	   str r0,[r4]
xss	   b xss
mask   dcd 0x0000ffff
value1 dcw 0x1111,0x2222,0x4444;Array of 16bit;Numbers(n=3);
  area data2,data,readwrite
result dcd 0x0
 end