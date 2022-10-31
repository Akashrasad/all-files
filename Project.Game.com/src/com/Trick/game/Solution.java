package com.Trick.game;
import java.util.*;

@ -1,56 +1,39 @@
class Solution {
	public static void main(String[] args) {

	
	
	public:
	    bool hidden(int i,int n, bool turn ,int alex, int lee, vector<int>& piles, int win) {
	        if(i<n) {
	            if(turn == true) {
	            if(alex+piles[0] >= win || alex+piles[n] >= win) {
	                return true;
	            } else {
	                bool r = hidden(i+1,n,!turn,alex+piles[i],lee,piles,win);
	                bool l = hidden(i,n-1,!turn,alex+piles[n],lee,piles,win);
	                if(r == l == true) {
	                    return true;
	                }
	                if(r==false && l==true) {
	    bool stoneGame(vector<int>& piles) {
	        int win;
	        for(int i:piles) {
	            win+=i;
	        }
	        win = win/2;
	        bool turn = true;
	        int i = 0;
	        int n = piles.size()-1;
	        int alex,lee;
	        alex=lee=0;
	        while(i>n) {
	            if(turn) {
	                if(piles[i]<piles[n]) {
	                    alex+=piles[i];
	                    i+=1;

	                } else if(l==false && r == true) {
	                } else {
	                    alex+=piles[n];
	                    n-=1;
	                }
	            } else {
	                if(piles[i]>piles[n]) {
	                    lee+=piles[i];
	                    i+=1;
	                } else {
	                    if(piles[i]<piles[n]) {
	                        alex+=piles[i];
	                        i+=1;
	                    } else {
	                        alex+=piles[n];
	                        n-=1;
	                    }
	                    lee+=piles[n];
	                    n-=1;
	                }
	                turn = !turn;
	            }
	        }
	        if(turn == false) {
	            if(lee+piles[0] >= win || lee+piles[n] >= win) {
	            if(lee>=win) {
	                return false;
	            } else {
	                bool r = hidden(i+1,n,!turn,alex,lee+piles[i],piles,win);
	                bool l = hidden(i,n-1,!turn,alex,lee+piles[n],piles,win);
	                if(r==false || l == false) {
	                    return false;
	                }
	                return true;
	            }
	        }
	            turn = !turn;
	        }
	        return true;
	    }
	    bool stoneGame(vector<int>& piles) {
	        int win;
	        for(int i:piles) {
	            win+=i;
	        }
	        win = win/2;
	        return hidden(0,piles.size()-1,true,0,0,piles,win);
	    }
	}