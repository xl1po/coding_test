class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a==b && b==c && c==d) {
            answer = 1111*a;
        }
        else if(a==b && b==c && c!=d) {
            answer = (10*a+d)*(10*a+d);
        }
        else if(a==b && b!=c && b==d) {
            answer = (10*a+c)*(10*a+c);
        }
        else if(a!=b && c==d && d==a) {
            answer = (10*a+b)*(10*a+b);
        }
        else if(a!=b && b==c && c==d) {
            answer = (10*b+a)*(10*b+a);
        }
        else if(a==b && b!=c && c==d) {
            if(b>c) answer = (b+c)*(b-c);
            else answer = (b+c)*(c-b);
        }
        else if(a!=b && b==c && a==d) {
            if(a>c) answer = (a+c)*(a-c);
            else answer = (a+c)*(c-a);
        }
        else if(a==c && b!=c && b==d) {
            if(b>c) answer = (b+c)*(b-c);
            else answer = (b+c)*(c-b);
        }
        else if(a==b && b!=c && b!=d && c!=d) {
            answer = c*d;
        }
        else if(a==c && c!=b && c!=d && b!=d) {
            answer = b*d;
        }
        else if(a==d && d!=c && d!=b && c!=b) {
            answer = c*b;
        }
        else if(b==c && c!=a && c!=d && a!=d) {
            answer = a*d;
        }
        else if(b==d && b!=c && b!=a && c!=a) {
            answer = c*a;
        }
        else if(c==d && b!=c && a!=d && a!=b) {
            answer = b*a;
        }
        else {
            if(a>b) {
                if(b>c){
                    if(c>d) answer = d;
                    else answer = c;
                }
                else {
                    if(b>d) answer = d;
                    else answer = b;
                }
            }
            else {
                if(a>c){
                    if(c>d) answer = d;
                    else answer = c;
                }
                else {
                    if(a>d) answer = d;
                    else answer = a;
                }
            }
        }
        
        
        
        return answer;
    }
}