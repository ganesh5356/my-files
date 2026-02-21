 AREA SUMMATION,CODE,READONLY
	
start		mov r5,#10
			mov r0,#0
			mov r1,#2
loop		add r0,r0,r1
			add r1,r1,#2
			subs r5,r5,#1
			cmp r5,#0
			bne loop
			ldr r4,=result
			str r0,[r4]
xss		b xss
	area data2,data,readwrite
result 	dcd 0x0
			end