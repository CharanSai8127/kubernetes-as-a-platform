# Network Latency Amplification

Latency amplification occurs when:
- small communication delays
spread across:
- distributed dependency chains.

---

# How Amplification Happens

Example:

Backend pods
→ Database
→ Slow responses
→ Open connections accumulate
→ Retries increase
→ More traffic generated
→ Database pressure increases further

---

# Cascading Latency

As latency increases:
- request queues grow
- thread pools saturate
- retries amplify traffic
- and timeout pressure spreads.

---

# Distributed-System Impact

Latency amplification may eventually create:
- dependency collapse
- cascading failures
- or complete service degradation.

---

# Why Recovery Is Difficult

Recovering systems frequently continue receiving:
- amplified retry traffic
while:
- dependencies remain unstable.

---

# Key Insight

Small latency increases may amplify into large-scale operational instability.
