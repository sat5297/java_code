/*Beginning of Distance.h*/
/*Header file containing the definition of the Distance class*/
class Distance
{
	int iFeet;
	float fInches;
	public: void setFeet(int); //prototype only
	int getFeet(); //prototype only
	void setInches(float); //prototype only
	float getInches(); //prototype only
}; /*End of Distance.h*/

void Distance::setFeet(int x) //definition
{
        iFeet=x;
}
int Distance::getFeet() //definition
{
        return iFeet;
}
void Distance::setInches(float y) //definition
{
        fInches=y;
}
float Distance::getInches() //definition
{
        return fInches;
}
