def num_count():
    n = int(input())
    arr = list(map(int,input().split()))
    arr = sorted(arr)
    count=0

    for j in range(len(arr)-1,-1,-1):
        if(n==0): break
        if(n>0): n-=arr[j]; count+=1
        else: pass
        
    print(count)


        


num_count()

--
