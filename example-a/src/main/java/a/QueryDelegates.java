package a;

import com.querydsl.core.annotations.QueryDelegate;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.DateTimePath;

import java.util.Date;

public class QueryDelegates {

	@QueryDelegate(Date.class)
	public static BooleanExpression somethingUseful(final DateTimePath<Date> attribute, final Date condition) {

		return attribute.between(new Date(), new Date());

	}

}
