
public class Pokemon
	{
		String name;
		String type;
		String ability;
		double weight;
		
		public Pokemon (String n, String t, String a, double w)
		{
			name = n;
			type = t;
			ability = a;
			weight = w;
		}
		
		public String getName()
			{
				return name;
			}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}

		public String getAbility()
			{
				return ability;
			}

		public void setAbility(String ability)
			{
				this.ability = ability;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}

		@Override
		public String toString()
			{
				return "Pokemon [type=" + type + ", ability=" + ability + ", weight=" + weight + "]";
			}
		
	}
