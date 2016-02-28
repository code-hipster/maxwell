package com.zendesk.maxwell.schema.ddl;

import com.zendesk.maxwell.MaxwellFilter;
import com.zendesk.maxwell.schema.*;
import com.zendesk.maxwell.schema.ddl.ResolvedDatabaseAlter;

public class DatabaseAlter extends SchemaChange {
	public String database;
	public String charset;

	public DatabaseAlter(String database) {
		this.database = database;
	}

	@Override
	public ResolvedDatabaseAlter resolve(Schema s) throws SchemaSyncError {
		return new ResolvedDatabaseAlter(this.database, this.charset);
	}

	@Override
	public boolean isBlacklisted(MaxwellFilter filter) {
		return false;
	}
}
