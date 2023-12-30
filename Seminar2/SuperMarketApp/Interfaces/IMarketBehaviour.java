package Interfaces;

import java.util.List;

import Classes.Actor;

public interface IMarketBehaviour {
public void acceptToMarket(IActorBehaviour actor);
public void releaseFromMarket(List<Actor> list);
public void update();
    
}
