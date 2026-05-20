# Cascading Latency

Latency amplification spreads through:
- distributed dependency chains.

Small delays at one layer may eventually impact:
- the entire platform.

---

# Amplification Flow

Database becomes slow
→ API latency increases
→ Requests queue
→ Thread pools saturate
→ Retries increase
→ More latency introduced

---

# Why Latency Is Dangerous

Distributed systems depend on:
- synchronous communication
across:
- multiple services
- and infrastructure layers.

Latency therefore propagates:
- operational instability.

---

# Operational Consequences

Cascading latency may create:
- timeouts
- retry storms
- queue buildup
- and partial outages.

---

# Recovery Difficulty

Latency often persists:
- after infrastructure recovers

because:
- retries
- reconnect storms
- and queues

continue generating:
- operational pressure.

---

# Key Insight

Distributed systems frequently degrade through latency propagation before complete failure occurs.
